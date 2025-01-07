package com.simple.exam.gui;

import javax.swing.*;
import java.awt.*;

public class MyFrameComponent extends JFrame {
    JButton jButton1, jButton2;

    MyFrameComponent(){
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("나의 윈도우");
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);

        jButton1 = new JButton("버튼1");
        jButton2 = new JButton("버튼2");

        this.add(jButton2);
        this.add(jButton1);

        setVisible(true);
    }

    public MyFrameComponent(JButton jButton1, JButton jButton2) {
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("나의 윈도우");
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);

//        jButton1 = new JButton("버튼1");
//        jButton2 = new JButton("버튼2");
        this.jButton1 = jButton1;
        this.jButton2 = jButton2;

        this.add(jButton2);
        this.add(jButton1);

        setVisible(true);
    }

    public static void main(String[] args) {
        JButton jButton1 = new JButton("저장");
        JButton jButton2 = new JButton("취소");
        new MyFrameComponent(jButton1,jButton2);
        //MyFrame myWin = new MyFrame();
    }
}
