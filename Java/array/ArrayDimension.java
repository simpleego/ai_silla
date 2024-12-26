package com.simple.exam.array;

public class ArrayDimension {
    public static void main(String[] args) {
        int[][] array = {
                {10,20,30,40},
                {50,60},
                {90,100,110,120,130,140,150}
        };

        System.out.println("행의 수 :" +array.length);
        System.out.println("렬의 수 :" +array[0].length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
