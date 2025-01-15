package com.simple.exam.gui.event;

import javax.swing.*;

public class TrafficSign extends JFrame {
    TrafficSign(){
        setSize(300,500);
        setTitle("신호등");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new TrafficPanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new TrafficSign();
    }
}
