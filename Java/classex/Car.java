package com.simple.exam.classex;

public class Car {
    final int SPEED_LEVEL = 10;
    String color;
    int speed;
    int gear;

    void changeGear(int gear){
        this.gear = gear;
    }

    void speedUp(){
        speed += SPEED_LEVEL;
    }

    void speedDown(){
        speed -= SPEED_LEVEL;
    }

    // setXXX, getXXX, toString

    @Override
    public String toString() {
        return "Car{" +
                "SPEED_LEVEL :" + SPEED_LEVEL +
                ", 색상 : " + color +
                ", 속도 : " + speed +
                ", 기어 : " + gear +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.color = "빨강";
        car.speed = 10;
        System.out.println(car);

        car.speedUp();
        car.speedUp();
        car.changeGear(3);
        car.speedUp();
        car.speedDown();
        System.out.println(car);


    }
}
