package com.simple.exam.classex2;

public class ArrayProcessTest {
    final static int STUDENTS = 5;

    public static void main(String[] args) {
     int[] scores =  new int[STUDENTS];
     ArrayProcess arrayProcess = new ArrayProcess();
     arrayProcess.getValues(scores);
        System.out.println("평균은 : " +
                arrayProcess.getAverage(scores));
    }
}
