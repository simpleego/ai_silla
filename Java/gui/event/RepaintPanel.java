package com.simple.exam.gui.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

class Rectangle {
    int x,y,w,h;
}


public class RepaintPanel extends JPanel implements MouseListener {
    BufferedImage img = null;
    int img_x =0;
    int img_y =0;
    Rectangle[] array = new Rectangle[3];
    int index=0;

    RepaintPanel(){
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(Rectangle r : array){
            if(r != null){
                g.drawRect(r.x,r.y,r.w,r.h);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
            if(index >= 3){
                return;
            }
            array[index] = new Rectangle();
            array[index].x = e.getX();
            array[index].y = e.getY();
            array[index].w = 50;
            array[index].h = 50;
            index++;
            repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
