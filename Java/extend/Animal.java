package com.simple.exam.extend;

public class Animal {
    private double weight;
    String picture;

    void sound(){
        System.out.println("동물은 짓는다.");
    }

    void eat(){
        System.out.println("eat()가 호출되었음");
    }
    void sleep(){
        System.out.println("sleep() 호출되었음");
    }
}
