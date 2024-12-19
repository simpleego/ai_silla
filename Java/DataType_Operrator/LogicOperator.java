package com.simple.exam;

public class LogicOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        boolean r1 = (x!=3)  && (y==4);
        boolean r2 = (x==3)  || (y==4);

        System.out.println(r1);
        System.out.println(r2);
    }
}
