package com.simple.exam.varoper;

public class Operator {
    public static void main(String[] args) {

        int year=2024;
        boolean isLeapYear;

        isLeapYear = (year % 4 == 0);
        System.out.println("윤년 : "+isLeapYear);
    }

}
