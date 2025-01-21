package com.simple.exam.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListEx {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("사과");
        fruitList.add("배");
        System.out.println("과일 상자 : "+fruitList);
        System.out.println("과일 상자 : "+fruitList.size());
        fruitList.add("딸기");
        System.out.println("과일 상자 : "+fruitList.size());
        String fruit = fruitList.remove(1);
        System.out.println("꺼낸 과일:"+fruit);
        System.out.println("과일 상자 : "+fruitList);
        fruitList.set(0,"포도");
        System.out.println("과일 상자 : "+fruitList);
        fruitList.add(0,"귤");
        System.out.println("과일 상자 : "+fruitList);

        for (int i = 0; i < fruitList.size(); i++) {
            System.out.print(fruitList.get(i)+",");
        }
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
