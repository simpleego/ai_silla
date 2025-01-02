package com.simple.exam.classex2;

public class Car {
    private String model;
    private String color;
    private int speed;

    // 자동차의 시리얼번호
    private int id;
    public static int numbers = 0;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.id = ++numbers;
    }

    public static int getNumberOfCars(){
        return numbers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", id=" + id +
                '}';
    }
}
