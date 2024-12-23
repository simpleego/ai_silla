package com.simple.exam.varoper;


import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        double perimeter;  // w*h*2
        double area;  // 면적(w*)
        int width, height;

        Scanner kbd = new Scanner(System.in);

        System.out.print("가로 : ");
        width = kbd.nextInt();

        System.out.print("세로 : ");
        height = kbd.nextInt();

        area = width * height;
        perimeter = 2*(width+height);

        System.out.printf("사각형 둘레 : %,d\n",(int)perimeter);
        System.out.printf("사각형 면적 : %,d\n",(int)area);
    }
}
