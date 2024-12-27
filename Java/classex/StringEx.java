package com.simple.exam.classex;

public class StringEx {
    public static void main(String[] args) {

        String str = "A barking dog";
        String strNew = new String("A barking dog");
        String strNew1 = new String("A barking dog");

        System.out.println("str : "+str.hashCode());
        System.out.println("strNew : "+strNew.hashCode());
        System.out.println("strNew1 : "+strNew1.hashCode());

        strNew = "Hello Java";
        System.out.println("strNew : "+strNew.hashCode());

    }
}
