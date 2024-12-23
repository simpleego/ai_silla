package com.simple.exam.loop;

import java.util.Scanner;

public class ExamLoopFor01 {

    public static void main(String[] args) {
        int maxNum;
        int evenSum=0;
        int oddSum=0;

        Scanner kbd = new Scanner(System.in);
        System.out.print("원하는 합의 최대수 입력 : ");

        maxNum = Integer.parseInt(kbd.nextLine());

        // 1부터 n까지의 짝수/홀수의 합을 구하시오.
        for(int i=1; i <= maxNum; i++){
            if(i%2 == 0)     // 짝수인지 판단
                evenSum += i;
            else
                oddSum += i;
        }
        System.out.println("1~"+maxNum+"까지의 짝수합 :"+evenSum);
        System.out.println("1~"+maxNum+"까지의 홀수합 :"+oddSum);
        System.out.println("1~"+maxNum+"까지의 합 :"+(evenSum+oddSum));
    }
}
