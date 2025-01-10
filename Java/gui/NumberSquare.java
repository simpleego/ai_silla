package com.simple.exam.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberSquare implements ActionListener {

    Calculator calculator;

    NumberSquare(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String num1_ = calculator.getNum1();
        String num2_ = calculator.getNum2();
        String result = "0";

        if(!num1_.isEmpty()){
            int num1 = Integer.parseInt(num1_);
            result = String.valueOf(num1*num1);
        }

        if(!num2_.isEmpty()){
            int num2 = Integer.parseInt(num2_);
            result = String.valueOf(num2*num2);
        }

        calculator.setResult(result);
    }
}
