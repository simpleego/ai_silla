package com.simple.exam.gui.event;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel {
    BufferedImage img = null;
    int img_x = 100;
    int img_y = 100;

    MyPanel() {
        try {
            img = ImageIO.read(new File("car.gif"));
        } catch (IOException e) {
            System.out.println("이미지가 없습니다.");
            System.exit(1);
        }

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode){
                    case KeyEvent.VK_UP: img_y -= 10; break;
                    case KeyEvent.VK_DOWN: img_y += 10; break;
                    case KeyEvent.VK_LEFT: img_x -= 10; break;
                    case KeyEvent.VK_RIGHT: img_x += 10; break;
                }
                repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        this.requestFocus();
        setFocusable(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img,img_x,img_y,null);
    }

}
