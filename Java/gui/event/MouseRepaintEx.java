package com.simple.exam.gui.event;

import javax.swing.*;

public class MouseRepaintEx extends JFrame {

    MouseRepaintEx(){
        setSize(300,300);
        setTitle("마우스 repaint");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new RepaintPanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseRepaintEx();
    }
}
