package com.simple.exam.thread;

import javax.swing.*;
import java.awt.*;

public class RandomThread extends Thread{
    private Container contentPane;
    private boolean flag=false;

    public RandomThread(Container contentPane) {
        this.contentPane = contentPane;
    }

    void finish(){
        flag = true;
    }

    @Override
    public void run() {
        while (true){
            int x = (int)(Math.random()*contentPane.getWidth());
            int y = (int)(Math.random()*contentPane.getHeight());

            JLabel label = new JLabel("java");
            label.setBounds(x,y,80,30);
            contentPane.add(label);
            contentPane.repaint();

            try {
                Thread.sleep(300);
                if(flag == true){
                    contentPane.removeAll();
                    label = new JLabel("Finish");
                    label.setForeground(Color.red);
                    label.setBounds(100,100,80,30);
                    contentPane.add(label);
                    contentPane.repaint();
                    return;
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
