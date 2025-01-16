package com.simple.exam.graphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LoadImage extends JPanel {
    BufferedImage img;

    LoadImage(){
        try {
            img = ImageIO.read(new File("dog.png"));
        }catch (IOException e){
            System.out.println("이미지가 없습니다.");
            e.printStackTrace();
        }

    }

    public void paint(Graphics g){
        g.drawImage(img, 0,0,null);
    }

    public Dimension getPreferredSize(){
        if(img == null){
            return new Dimension(100,100);
        }else {
            return new Dimension(img.getWidth(null), img.getHeight(null));
        }
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("이미지 화면 출력");
        LoadImage img = new LoadImage();
        Dimension size = img.getPreferredSize();
        win.setSize(size);
        win.add(img);

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.pack();
        win.setVisible(true);
    }

}
