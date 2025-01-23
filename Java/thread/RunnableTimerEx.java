package com.simple.exam.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunnableTimerEx extends JFrame {

    RunnableTimerEx(){
        setTitle("타이머 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        contentPane.add(timerLabel);
        Thread th = new Thread(new TimerRunnable(timerLabel));

        JButton jButton = new JButton("종료");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                th.interrupt();
                JButton btn = (JButton) e.getSource();
                btn.setEnabled(false);
            }
        });

        contentPane.add(jButton);

        setVisible(true);
        th.start();
    }

    public static void main(String[] args) {
         new RunnableTimerEx();
    }
}
