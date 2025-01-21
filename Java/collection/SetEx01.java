package com.simple.exam.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx01 {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();
        String[] sample ={"단어","중복","중복","구절"};

        for (String a : sample){
            if(!str.add(a)){
                System.out.println("중복된 것 : "+a);
            }
        }
        System.out.println("중복이 제거된 것 : "+str);
        System.out.println("건수: "+str.size());

    }

}
