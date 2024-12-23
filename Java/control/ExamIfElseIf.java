package com.simple.exam.control;

import java.util.Scanner;

public class ExamIfElseIf {
    public static void main(String[] args) {
        int num;
        char grade=' ';

        Scanner kbd = new Scanner(System.in);

        System.out.print("성적을 입력 :");
        num = kbd.nextInt();

        if(num >= 90){
            grade = 'A';
        } else if (num >= 80) {
            grade = 'B';
        } else if (num >= 70) {
            grade = 'C';

        } else {
            grade = 'F';
        }

        System.out.println(" 학점 : " + grade);
    }
}
