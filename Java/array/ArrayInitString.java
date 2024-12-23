package com.simple.exam.array;

public class ArrayInitString {
    public static void main(String[] args) {
        String[] scores = {"Pepperoni","Mushroom",
                "Onion","Sausage","Bacon"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("배열 값 : "+scores[i]);
        }
    }
}
