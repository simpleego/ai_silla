package com.simple.exam.extend;

public class Car {
    int speed;

    Car(){
        System.out.println("Car 생성됩니다.");
    }

    public Car(int speed) {
        this.speed = speed;
        System.out.println("Car speed 생성됩니다.");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
