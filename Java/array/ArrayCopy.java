package com.simple.exam.array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};

        int[] num2 = new int[num.length];

        //num2 = num;
        System.out.println();
//        for (int i = 0; i < num.length; i++) {
//            num2[i] = num[i];
//        }
        num2 = Arrays.copyOf(num,num.length);

        for (int n : num2){
            System.out.print(n+" ");
        }
        System.out.println();

        num2[0] = 10;

        for (int n : num){
            System.out.print(n+" ");
        }

        System.out.println();
        for (int n : num2){
            System.out.print(n+" ");
        }

    }
}
