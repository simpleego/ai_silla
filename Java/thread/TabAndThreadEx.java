package com.simple.exam.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TabAndThreadEx extends JFrame {
    MyLabel bar = new MyLabel(100);

    TabAndThreadEx(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,200);
        Container c = getContentPane();
        c.setLayout(null);

        bar.setBackground(Color.ORANGE);
        bar.setOpaque(true);
        bar.setBounds(20,50,300,20);
        c.add(bar);


        bar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                bar.fill(); // 키를 누를 때마다 바가 1씩 증가한다.
            }
        });

        c.setFocusable(true);
        c.requestFocus();

        ConsummerThread th = new ConsummerThread(bar);
        th.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new TabAndThreadEx("생산자-소비자 동기화");
    }

}
