package com.simple.exam.control;

import java.util.Scanner;

public class ExamMultipleOfNumber {
    public static void main(String[] args) {
        int num1, multipleNumber;
        String result;

        Scanner kbd = new Scanner(System.in);

        System.out.print("정수를 입력 :");
        num1 = kbd.nextInt();

        System.out.print("원하는 배수 ? :");
        multipleNumber = kbd.nextInt();

        if (num1 % multipleNumber == 0) {
            result = num1 + "는" + multipleNumber + "의 배수입니다.";
        } else {
            result = num1 + "는" + multipleNumber + "의 배수가 아닙니다.";
        }
        System.out.println(result);
    }
}
