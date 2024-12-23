package com.simple.exam.loop;

import java.util.Scanner;

public class ExamLoop2 {

    public static void main(String[] args) {
        int gugudan;
        int i=1;

        Scanner kbd = new Scanner(System.in);
        System.out.print("원하는 구구단 입력 : ");

        gugudan = Integer.parseInt(kbd.nextLine());

        while(i<10){
            System.out.println(gugudan+"x"+i+"="+gugudan*i+" ");
            if(i%2 == 0)
                System.out.println("-------------");
            i++;
        }
    }
}
