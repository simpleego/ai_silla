package com.simple.exam.loop;

import java.util.Scanner;

public class ExamLoopFor02 {

    public static void main(String[] args) {

        // 1부터 n까지 더해서 100이 넘으면 종료하시오.
        int maxNum;
        int sum = 0;

        Scanner kbd = new Scanner(System.in);
        System.out.print("원하는 수 입력 : ");

        maxNum = Integer.parseInt(kbd.nextLine());

        // 1부터 n까지의 짝수/홀수의 합을 구하시오.
        for(int i=1; sum <= maxNum; i++){
            sum += i;
            System.out.println(i+": "+sum);
        }

    }
}
