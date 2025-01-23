package com.simple.exam.thread;

import javax.swing.*;
import java.awt.*;

public class ThreadTimerEx extends JFrame {

    ThreadTimerEx(){
        setTitle("타이머 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        contentPane.add(timerLabel);
        TimerThread th = new TimerThread(timerLabel);

        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new ThreadTimerEx();
    }
}
