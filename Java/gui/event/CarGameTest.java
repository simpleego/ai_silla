package com.simple.exam.gui.event;

import javax.swing.*;

public class CarGameTest extends JFrame {
    CarGameTest(){
        setSize(300,300);
        setTitle("자동차 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new MyPanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new CarGameTest();
    }
}
