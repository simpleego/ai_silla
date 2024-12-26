package com.simple.exam.array;

public class AnonymousArray {
    public static void main(String[] args) {
        System.out.println("숫자들의 합 : " +
                sum(new int[] {1,2,3,4,5,6,7,8,9,10}));
    }

    private static int sum(int[] numbers) {
        int total=0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
