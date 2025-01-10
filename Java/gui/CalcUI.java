package com.simple.exam.gui;

import javax.swing.*;
import java.awt.*;

public class CalcUI extends JFrame {
    private JPanel panel;
    private JTextField textField;
    private JButton[] buttons;
    private String[]  labels={
            "BS","","","CE","C",
            "7","8","9","/","sqrt",
            "4","5","6","x","%",
            "1","2", "3", "-","1/x",
            "0","+/-",".","+","=" };
    CalcUI(){
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("배치 관리자");

        panel = new JPanel();
        textField = new JTextField(35);
        textField.setText("0");
        textField.setEnabled(false);

        panel.setLayout(new GridLayout(0,5,3,3));
        buttons = new JButton[25];
        int index=0;
        for (int row=0; row <5 ; row++) {
            for (int col = 0; col < 5; col++) {
                buttons[index] = new JButton(labels[index]);
                if(col >=3){
                    buttons[index].setForeground(Color.red);
                }else {
                    buttons[index].setForeground(Color.blue);
                }
                buttons[index].setBackground(Color.yellow);
                panel.add(buttons[index]);
                index++;
            }
        }

        add(panel, BorderLayout.CENTER);
        add(textField,BorderLayout.NORTH);
        pack();

        setVisible(true);
    }

    public static void main(String[] args) {
        new CalcUI();
    }
}
