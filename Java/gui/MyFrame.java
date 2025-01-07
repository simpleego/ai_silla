package com.simple.exam.gui;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("나의 윈도우");
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
        //MyFrame myWin = new MyFrame();
    }
}
