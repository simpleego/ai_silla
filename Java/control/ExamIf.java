package com.simple.exam.control;

import java.util.Scanner;

public class ExamIf {
    public static void main(String[] args) {
        int num;
        String even_odd = "짝수";

        Scanner kbd = new Scanner(System.in);

        System.out.print("정수를 입력 :");
        num = kbd.nextInt();

        if(num%2 != 0){
            even_odd = "홀수";
        }
        System.out.println(" 결과 :" + even_odd);
    }
}
