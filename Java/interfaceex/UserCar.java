package com.simple.exam.interfaceex;

public class UserCar {
    public static void main(String[] args) {
        AutoCar autoCar = new AutoCar();

        autoCar.start();
        autoCar.turn(30);
        autoCar.setSpeed(50);
        autoCar.stop();
    }
}
