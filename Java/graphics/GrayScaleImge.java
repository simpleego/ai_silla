package com.simple.exam.graphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GrayScaleImge extends JFrame {
    BufferedImage image;
    int width;
    int height;

    GrayScaleImge() throws IOException {
        setTitle("컬러2Gray");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        File input = new File("Lenna.png");
        image = ImageIO.read(input);
        width = image.getWidth();
        height = image.getHeight();

        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                Color color = new Color(image.getRGB(r, c));

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                int avg = (red + green + blue) / 3 - 50;
                if(avg > 255)
                    avg = 255;

                if(avg < 0)
                    avg = 0;

                Color newColor = new Color(avg, avg, avg);

                image.setRGB(r, c, newColor.getRGB());
            }
        }
        File output = new File("output.png");
        ImageIO.write(image, "png", output);
        add(new MyPanel());
        setSize(300,300);
        pack();

        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.drawImage(image, 0, 0, null);
        }
    }

    public Dimension getPreferredSize(){
        if(image == null){
            return new Dimension(100,100);
        }else {
            return new Dimension(image.getWidth(null),
                    image.getHeight(null));
        }
    }

    public static void main(String[] args) throws Exception{
        new GrayScaleImge();
    }
}