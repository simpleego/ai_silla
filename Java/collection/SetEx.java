package com.simple.exam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx {
    public static void main(String[] args) {
        HashSet<String> fruitList = new HashSet<>();

        fruitList.add("사과");
        fruitList.add("배");
        System.out.println("과일 상자 : "+fruitList);
        System.out.println("과일 상자 : "+fruitList.size());
        fruitList.add("딸기");
        System.out.println("과일 상자 : "+fruitList.size());
        System.out.println("과일 상자 : "+fruitList);

        System.out.println();
        for (String item : fruitList){
            System.out.println(item+",");
        }

        Iterator e = fruitList.iterator();
        String fruitItem;
        while (e.hasNext()){
            fruitItem = (String) e.next();
            System.out.println(fruitItem);
        }

//        fruitItem = (String) e.next();
//        System.out.println(fruitItem);

    }

}
