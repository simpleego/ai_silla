package com.simple.exam.classex;

import java.util.Scanner;

public class StringEx03 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String str, tempStr;

        while (true) {
            System.out.println("문자열을 입력하세요.");
            str = kbd.nextLine();
            if (str.equals("quit")) {
                break;
            }
            tempStr = str.substring(0,3);

            if(str.matches("^www\\.(.+)")){
                System.out.println("www 로 시작합니다.");
            }else{
                System.out.println("www 로 시작하지 않습니다.");
            }

//            if(tempStr.equals("www")){
//                System.out.println("www 로 시작합니다.");
//            }else {
//                System.out.println("www 로 시작하지 않습니다.");
//            }
        }
    }
}
