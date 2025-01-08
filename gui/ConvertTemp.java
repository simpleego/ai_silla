package com.simple.exam.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertTemp extends JFrame {
    JLabel label1;
    JLabel label2;

    JTextField text1;
    JTextField text2;

    JButton button;


    ConvertTemp(){
        setSize(250,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("윈도우 가운데 설정");
        setResizable(false);

        // 레이아웃 설정
        setLayout(new FlowLayout());

        // 컴포넌트 생성
        label1 = new JLabel("화씨온도 : ");
        label2 = new JLabel("섭씨온도 : ");

        text1 = new JTextField(10);
        text2 = new JTextField(10);

        button = new JButton("변환");
        // 컴포넌트 등록
        add(label1); add(text1);
        add(label2); add(text2);
        add(button);

        // 컴포넌트 이벤트리스너 등록
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int TempC = Integer.parseInt(text1.getText());
                double TempF = TempC*1.8+32;
                text2.setText(String.valueOf(TempF));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ConvertTemp();
    }
}
