package com.simple.exam.loop;

import java.util.Scanner;

public class ExamLoop3 {

    public static void main(String[] args) {
        int maxNum;
        int i=1;
        int sum=0;

        Scanner kbd = new Scanner(System.in);
        System.out.print("원하는 합의 최대수 입력 : ");

        maxNum = Integer.parseInt(kbd.nextLine());

        while(i<=maxNum){
            //System.out.println(gugudan+"x"+i+"="+gugudan*i+" ");
            sum += i;  // sum = sum + i
            i++;
        }
        System.out.println("1~"+maxNum+"까지의 합 :"+sum);
    }
}
