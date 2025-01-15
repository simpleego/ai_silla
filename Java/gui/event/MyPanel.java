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
    static final int KEY_UP = 83;
    static final int KEY_DOWN = 88;
    static final int KEY_LEFT = 90;
    static final int KEY_RIGHT = 67;
    BufferedImage img = null;
    BufferedImage img2 = null;
    int img_x = 100;
    int img2_x = 300;
    int img_y = 100;
    int img2_y = 300;

    MyPanel() {
        try {
            img = ImageIO.read(new File("car.gif"));
            img2 = ImageIO.read(new File("car.gif"));
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
                System.out.println(keyCode);
                switch (keyCode){
                    case KeyEvent.VK_UP: img_y -= 10; break;
                    case KeyEvent.VK_DOWN: img_y += 10; break;
                    case KeyEvent.VK_LEFT: img_x -= 10; break;
                    case KeyEvent.VK_RIGHT: img_x += 10; break;

                    case KEY_UP: img2_y -= 10; break;
                    case KEY_DOWN: img2_y += 10; break;
                    case KEY_LEFT: img2_x -= 10; break;
                    case KEY_RIGHT: img2_x += 10; break;
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
        g.drawImage(img2,img2_x,img2_y,null);
    }

}
