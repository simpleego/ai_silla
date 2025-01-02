package com.simple.exam.extend;

public class SportCarTest {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();

        System.out.println("속도: "+sportCar.speed);
        sportCar.setTurbo(true);
        System.out.println("터보기능: "+sportCar.turbo);
    }
}
