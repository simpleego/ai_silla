package com.simple.exam;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        int nextX = x++;
        int nextY = y++;
        System.out.println("nextX :"+(++nextX));
        System.out.println("nextY :"+(++nextY));
    }
}
