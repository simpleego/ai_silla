package com.simple.exam.varoper;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);

//        System.out.println("문장을 입력하세요");
//        String msg = kbd.nextLine();
//        System.out.println("입력한 문장:" +msg);

        System.out.println("나이를 입력하세요");
        int age = kbd.nextInt();
        System.out.println("입력한 나이:" +age);
    }
}
