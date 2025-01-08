package com.simple.exam.gui;

import javax.swing.*;

public class FrameTest {

    public static void main(String[] args) {
        JFrame win = new JFrame("Frame Test");
        JFrame win1 = new JFrame("나의 윈도우");
        win.setSize(300,200);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);

        win1.setSize(500,500);
        win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win1.setVisible(true);

    }
}
