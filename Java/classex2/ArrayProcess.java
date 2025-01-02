package com.simple.exam.classex2;

import java.util.Scanner;

public class ArrayProcess {

    public void getValues(int[] array){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("성적을 입력 :");
            array[i] = scanner.nextInt();
        }
    }

    public double getAverage(int[] array){
        double total=0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total/array.length;
    }
}
