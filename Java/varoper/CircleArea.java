package com.simple.exam.varoper;


import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.141592;
        int radius;  // 반지름
        double area;  // 면적(PI*radius*radius)

        Scanner kbd = new Scanner(System.in);

        System.out.println("원의 반지름 : ");
        radius = kbd.nextInt();
        area = PI * radius * radius;

        System.out.printf("원의 면적 : %,6.2f",area);
    }
}
