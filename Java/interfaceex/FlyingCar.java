package com.simple.exam.interfaceex;

interface Drivable {
    public void drive();
}

interface Flyable{
    public void fly();
}

public class FlyingCar implements Drivable, Flyable{

    @Override
    public void drive() {
        System.out.println("자동차로 달린다.");
    }

    @Override
    public void fly() {
        System.out.println("비행기로 날아다닌다.");
    }

    public static void main(String[] args) {
        FlyingCar flyingCar = new FlyingCar();

        flyingCar.drive();
        flyingCar.fly();
    }
}
