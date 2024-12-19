package com.simple.exam;

public class CharacterTypeExam {
    public static void main(String[] args) {
        char ch = '가';
        char ch1 = '\uac01';

        char ch2 = 'a';
        char ch3 = 65;

        ch2 = (char) (ch2 + 1);

        System.out.println("문자값 :"+ch);
        System.out.println("문자값 :"+ch);
        System.out.println("문자값 :"+ch2);
        System.out.println("문자값 :"+ ++ch3);
    }
}
