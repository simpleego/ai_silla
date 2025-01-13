package com.simple.exam.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
    JTextField num1, num2, tfResult;
    JButton add,sub,mul,div, square, sqrt;
    JLabel lblNum1, lblNum2, lblResult;

    public String getNum1(){
        return num1.getText();
    }

    public String getNum2(){
        return num2.getText();
    }

    public  void setResult(String result){
        tfResult.setText(result);
    }

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
        tfResult = new JTextField(15);

        add = new JButton("덧셈");
        sub = new JButton("뺄셈");
        mul = new JButton("곱셈");
        div = new JButton("나눗셈");
        square = new JButton("제곱");
        sqrt = new JButton("root");

        square.addActionListener(new NumberSquare(this));
        sqrt.addActionListener(new MySqrt());

        sub.addActionListener(e-> {
                String num1_ = num1.getText();
                String num12_ = num2.getText();
                String result_;
                int sum = Integer.parseInt(num1_) - Integer.parseInt(num12_);
                result_ = String.valueOf(sum);
                tfResult.setText(result_);
        });

        add.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  String num1_ = num1.getText();
                  String num12_ = num2.getText();
                  String result_;
                  int sum = Integer.parseInt(num1_) + Integer.parseInt(num12_);
                  result_ = String.valueOf(sum);
                  tfResult.setText(result_);
              }
          });

        mul.addActionListener(this);
        div.addActionListener(this);


        // 컴포넌트 등록
        add(lblNum1); add(num1);
        add(lblNum2); add(num2);
        add(add); add(sub);
        add(mul); add(div);
        add(square);
        add(sqrt);

        add(lblResult); add(tfResult);
        setVisible(true);
    }

    // 내부 클래스로 이벤트 처리
    private class MySqrt implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String num1_ = num1.getText();
            tfResult.setText(String.valueOf(Math.sqrt(Double.parseDouble(num1_))));
        }
    }


    public static void main(String[] args) {
        Calculator calculator = new  Calculator();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String num1_ = num1.getText();
        String num12_ = num2.getText();
        String result_;
        int result;

        JButton button = (JButton)e.getSource();

        if(button == mul) {
            result = Integer.parseInt(num1_) * Integer.parseInt(num12_);
        }else {
            result = Integer.parseInt(num1_) / Integer.parseInt(num12_);
        }

        result_ = String.valueOf(result);
        tfResult.setText(result_);
    }
}
