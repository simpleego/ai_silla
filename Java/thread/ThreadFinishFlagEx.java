package com.simple.exam.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ThreadFinishFlagEx extends JFrame {
    private RandomThread th;
    ThreadFinishFlagEx(){
        setTitle("레이블 출력 쓰레드");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        contentPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                th.finish();
            }
        });

        th = new RandomThread(contentPane);
        th.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new ThreadFinishFlagEx();
    }

}
