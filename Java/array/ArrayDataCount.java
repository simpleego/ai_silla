package com.simple.exam.array;

public class ArrayDataCount {
    public static void main(String[] args) {
        final int SIZE = 6;
        int freq[] = new int[SIZE];
        int index = 0;

        for (int i = 0; i < 1000000; i++) {
            index = (int)(Math.random()*SIZE);
            freq[index] = freq[index] + 1;
        }

        for (int i = 0; i < SIZE; i++) {
            System.out.println(i+":"+freq[i]);

        }
    }
}
