package com.simple.exam.thread;

import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    int maxBufferSize;
    int barSize=0;
    public MyLabel(int maxBufferSize) {
        this.maxBufferSize = maxBufferSize;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        int width = (int)(((double)(this.getWidth()))
                /maxBufferSize*barSize);
        if(width==0) return;
        g.fillRect(0, 0, width, this.getHeight());
    }

    public synchronized void fill(){
        System.out.println("========>");
        if(barSize == maxBufferSize){
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        barSize++;
        repaint();
        notify();
    }

    public synchronized void consume() {
        if(barSize == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        barSize--;
        repaint();
        notify();
    }
}