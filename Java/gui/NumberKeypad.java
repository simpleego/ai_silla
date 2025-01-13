package com.simple.exam.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberKeypad extends JFrame implements ActionListener {

    private JTextField textField;
    private JPanel jPanel;

    NumberKeypad(){
        // 윈도우 초기설정
        setSize(100,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("나의 윈도우");

        textField = new JTextField(20);
        textField.setEnabled(false);

        add(textField, BorderLayout.NORTH);
        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3,3));
        add(jPanel,BorderLayout.CENTER);

        for (int i = 0; i <9; i++) {
            JButton btn = new JButton(""+i);
            btn.addActionListener(this);
            btn.setPreferredSize(new Dimension(100,100));
            jPanel.add(btn);
        }

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnCaption = e.getActionCommand();
        textField.setText(textField.getText()+btnCaption);
    }

    public static void main(String[] args) {
        new NumberKeypad();
    }
}
