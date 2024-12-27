package com.simple.exam.classex;

public class StringEx01 {
    public static void main(String[] args) {
        String str = "A barking dog 강아지";

        String s1,s2,s3,s4;

        System.out.println("문자열의 길이 : "+str.length());

        s1 = str.concat(" never Bites!");
        System.out.println("s1 : "+str+s1);

        // 문자열 치환
        s2 = str.replace('b','B');
        System.out.println("s2 : "+s2);

        s3 = str.substring(10);
        System.out.println("s3 : "+s3);

        s3 = str.substring(0,10);
        System.out.println("s3 : "+s3);

        s4 = str.toUpperCase();
        System.out.println("s4 : "+s4);

        char s5 = str.charAt(0);
        System.out.println("s5 : "+s5);
    }
}
