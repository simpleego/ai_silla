package com.simple.exam.varoper;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        // 키보드로 2개의 정수를 입력받아서
        // 덧셈한 결과를 출력하시오.

        Scanner input = new Scanner(System.in);

        System.out.print("num1 : ");
        int num1 = input.nextInt();

        System.out.print("num2 : ");
        int num2 = input.nextInt();

        int sum = num1+num2;

        System.out.println(num1+"+"+num2+"="+sum);
    }
}
