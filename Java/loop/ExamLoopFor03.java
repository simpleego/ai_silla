package com.simple.exam.loop;

import java.util.Scanner;

public class ExamLoopFor03 {

    public static void main(String[] args) {

        // n! 구하기
        int num;
        long sum = 1;

        Scanner kbd = new Scanner(System.in);
        System.out.print("원하는 수 입력 : ");

        num = Integer.parseInt(kbd.nextLine());

        // 1부터 n까지의 짝수/홀수의 합을 구하시오.
        for(int i=1; i<=num; i++){
            sum *= i;
            System.out.println(i+"! = "+sum);
        }

    }
}
