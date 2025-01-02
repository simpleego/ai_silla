package com.simple.exam.extend;

public class AnimalTest {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Lion lion2 = new Lion();

        lion1.roar();
        lion2.eat();

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.sleep();
    }
}
