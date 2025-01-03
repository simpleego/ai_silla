package com.simple.exam.extend;

public class Dog extends Animal{

    @Override
    public void sound(){
        System.out.println("멍멍하고 짓는다.");
    }

    public void play(){
        System.out.println("운동을 한다.");
    }
}
