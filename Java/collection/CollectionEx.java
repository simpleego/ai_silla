package com.simple.exam.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx {
    public static void main(String[] args) {
        String[] sample = {"i", "walk","the","line"};
        List<String> list = Arrays.asList(sample);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
