package com.simple.exam.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField num1, num2, result;
    JButton add,sub,mul,div;
    JLabel lblNum1, lblNum2, lblResult;

    Calculator(){
        // 윈도우 초기설정
        setSize(100,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("나의 윈도우");

        // 레이아웃 설정
        setLayout(new FlowLayout());

        // 컴포넌트 생성
        lblNum1 = new JLabel("숫자 1: ");
        lblNum2 = new JLabel("숫자 2: ");
        lblResult = new JLabel("결과 값: ");

        num1 = new JTextField(15);
        num2 = new JTextField(15);
        result = new JTextField(15);

        add = new JButton("덧셈");
        sub = new JButton("뺄셈");

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1_ = num1.getText();
                String num12_ = num2.getText();
                String result_;
                int sum = Integer.parseInt(num1_) - Integer.parseInt(num12_);
                result_ = String.valueOf(sum);
                result.setText(result_);
            }
        });

        add.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  String num1_ = num1.getText();
                  String num12_ = num2.getText();
                  String result_;
                  int sum = Integer.parseInt(num1_) + Integer.parseInt(num12_);
                  result_ = String.valueOf(sum);
                  result.setText(result_);
              }
          });


                // 컴포넌트 등록
                add(lblNum1); add(num1);
        add(lblNum2); add(num2);
        add(add); add(sub);

        add(lblResult); add(result);
        setVisible(true);
    }

    public static void main(String[] args) {
        new  Calculator();
    }
}
