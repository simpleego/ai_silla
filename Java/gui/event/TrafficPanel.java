package com.simple.exam.gui.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficPanel extends JPanel implements ActionListener {

    boolean flag = false;
    private int light_number = 0;

    TrafficPanel(){
        setLayout(new BorderLayout());
        JButton button = new JButton("traffic light turn on");
        add(button,BorderLayout.SOUTH);
        button.addActionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawOval(100,100,100,100);
        g.drawOval(100,200,100,100);
        g.drawOval(100,300,100,100);
        if(light_number == 0){
            g.setColor(Color.RED);
            g.fillOval(100,100,100,100);
        }else if(light_number == 1){
            g.setColor(Color.GREEN);
            g.fillOval(100,200,100,100);
        }else {
            g.setColor(Color.YELLOW);
            g.fillOval(100,300,100,100);
        }
        System.out.println("------------");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(++light_number >= 3){
            light_number = 0;
        }
        repaint();
    }
}
