package com.simple.exam.control;

import java.util.Scanner;

public class ExamSwitchCase {
    public static void main(String[] args) {
        int num;
        String result;

        Scanner kbd = new Scanner(System.in);

        System.out.print("숫자를 입력하세요");
        num = kbd.nextInt();

        switch (num){
            case 1:
            case 2:
                result="하나와둘";
                break;
            case 3:
                result="셋";
                break;
            default:
                result = "모르겠네요";
        }

        System.out.println(result);

    }
}
