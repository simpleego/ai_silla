package com.simple.exam;

public class DataTypeExam1 {

    public static void main(String[] args) {

        byte byteNum = 125;
        int num = 520;
        long longNum;
        float floatNum=123.123456789123456789f;
        double doubleNum = 123.1234567890123456789;

        longNum = 1234567L;

        num = byteNum;

        System.out.println(" num : "+num);
        System.out.println("byte num : "+byteNum);

        System.out.println("float num : "+floatNum);
        System.out.println("double num : "+doubleNum);
    }
}
