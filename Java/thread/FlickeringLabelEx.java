package com.simple.exam.thread;

import javax.swing.*;
import java.awt.*;

public class FlickeringLabelEx extends JFrame {

    FlickeringLabelEx(){
        setTitle("타이머 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        FlickeringLabel fLabel  = new FlickeringLabel("깜박",500);
        FlickeringLabel fLabel1  = new FlickeringLabel("나도깜박",300);
        JLabel label = new JLabel("안깜박");

        contentPane.add(fLabel);
        contentPane.add(label);
        contentPane.add(fLabel1);

        setVisible(true);
    }

    public static void main(String[] args) {
         new FlickeringLabelEx();
    }
}
