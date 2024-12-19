package com.simple.exam.control;

import java.util.Scanner;

public class ExamLagerNumber {
    public static void main(String[] args) {
        int num1, num2;
        String result;

        Scanner kbd = new Scanner(System.in);

        System.out.print("정수를 입력 :");
        num1 = kbd.nextInt();

        System.out.print("정수를 입력 :");
        num2 = kbd.nextInt();

        if(num1 > num2) {
            result = "큰수 :"+num1;
        }else {
            if(num1 < num2 ){
                result = "큰수 :"+num2;
            }else{
                result = "두개의 값은 같다";
            }
        }

        System.out.println(result);
    }
}
