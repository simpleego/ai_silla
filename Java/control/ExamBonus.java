package com.simple.exam.control;

import java.util.Scanner;

public class ExamBonus {
    public static void main(String[] args) {
        int mySales, bonus=0;
        final int TARGET_SALES = 1_000;

        Scanner kbd = new Scanner(System.in);

        System.out.print("실적 입력 :");
        mySales = kbd.nextInt();

        if (mySales - TARGET_SALES > 0) {
            bonus = (int)((mySales - TARGET_SALES) * 0.1);
        }else {
            System.out.println((TARGET_SALES - mySales)+"만큼 실적 미달입니다.");
        }

        System.out.println("실적 : "+mySales);
        System.out.println("보너스 :"+bonus);
    }
}