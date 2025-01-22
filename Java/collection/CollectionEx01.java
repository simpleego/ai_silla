package com.simple.exam.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx01 {
    public static void main(String[] args) {
        int key = 5;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        int index=Collections.binarySearch(list,key);
        System.out.println(index);
    }
}
