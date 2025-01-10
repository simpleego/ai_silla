package com.simple.exam.gui;

import javax.swing.*;
import java.awt.*;

public class LayoutEx extends JFrame {
    LayoutEx(){
        setSize(300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("배치 관리자");

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT,30,30));
        JPanel borderPanel = new JPanel(new BorderLayout(30,30));
        JPanel gridPanel = new JPanel(new GridLayout(0,3,30,30));

        panel.add(new JButton("버튼1"));
        panel.add(new JButton("버튼2"));
        panel.add(new JButton("버튼3"));
        panel.add(new JButton("버튼4"));
        panel.add(new JButton("버튼5"));
        panel.add(new JButton("버튼6"));
        panel.setBackground(Color.blue);

        borderPanel.add(new JButton("버튼1"), BorderLayout.NORTH);
        borderPanel.add(new JButton("버튼2"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("버튼3"), BorderLayout.EAST);
        borderPanel.add(new JButton("버튼4"), BorderLayout.WEST);
        borderPanel.add(new JButton("버튼5"), BorderLayout.CENTER);
        borderPanel.add(new JButton("버튼6"),BorderLayout.NORTH);
        borderPanel.setBackground(Color.blue);


        gridPanel.add(new JButton("버튼1"));
        gridPanel.add(new JButton("버튼2"));
        gridPanel.add(new JButton("버튼3"));
        gridPanel.add(new JButton("버튼4"));
        gridPanel.add(new JButton("버튼5"));
        gridPanel.add(new JButton("버튼6"));
        gridPanel.add(new JButton("버튼7"));
        gridPanel.setBackground(Color.blue);

        add(panel);
        add(borderPanel);
        add(gridPanel);

        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new LayoutEx();
    }
}
