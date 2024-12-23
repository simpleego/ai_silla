package com.simple.exam.array;

import java.util.Scanner;

public class Sungjuk {
    public static void main(String[] args) {
        final int STUDENT_NUMBER = 3;
        int total = 0;
        double average=0.0;
        int[] scores = new int[STUDENT_NUMBER];

        Scanner kbd;

        kbd = new Scanner(System.in);

        for (int i = 0; i < STUDENT_NUMBER; i++) {
            System.out.print(i+"번 성적입력 : ");
            scores[i] = kbd.nextInt();
            total += scores[i];
        }

        // 성적 평균을 구하고 출력
        average = (double) total / STUDENT_NUMBER;
        System.out.printf("성적 평균 : %6.2f",average);
    }
}
