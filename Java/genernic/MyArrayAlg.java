package com.simple.exam.genernic;

public class MyArrayAlg {
    public static <T> T getLast(T[] array){
        return array[array.length-1];
    }

    public static void main(String[] args) {
        String[] language = {"C++","Python","Java"};
        Integer[] nums = {10,20,40,70};
        String last =  MyArrayAlg.getLast(language);
        System.out.println(last);

        int lastnum = MyArrayAlg.getLast(nums);
        System.out.println(lastnum);
    }
}
