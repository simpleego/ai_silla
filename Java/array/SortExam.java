package com.simple.exam.array;

import java.util.Arrays;

public class SortExam {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
                int num = (int)(Math.random()*100+1);
                numbers[i] = num;
        }

        for (int n : numbers){
            System.out.print(n+ " ");
        }

        Arrays.sort(numbers);

        System.out.println("정렬된 후");
        for (int n : numbers){
            System.out.print(n+ " ");
        }



    }
}
