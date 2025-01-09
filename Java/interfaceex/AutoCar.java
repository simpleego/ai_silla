package com.simple.exam.interfaceex;

public class AutoCar implements OperateCar{
    @Override
    public void start() {
        System.out.println("자동차가 출발합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 정지합니다.");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("자동차 속도를"+speed+"만큼 변경합니다.");
    }

    @Override
    public void turn(int degree) {
        System.out.println("자동차가 방향을"+degree+"도 만큼 방향을 변경합니다.");
    }
}
