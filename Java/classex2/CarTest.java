package com.simple.exam.classex2;

public class CarTest {
    public static void main(String[] args) {
        System.out.println(Car.numbers);
        Car car1 = new Car("S600","white",80);
        System.out.println("자동차 id : "+car1);
        System.out.println(Car.numbers);

        Car car2 = new Car("S600","white",80);
        System.out.println("자동차 id : "+car2);
        System.out.println(Car.numbers);
        System.out.println(car1.numbers);

        System.out.println("생산된 자동차 수 : "+Car.getNumberOfCars());
        System.out.println("생산된 자동차 수 : "+car2.getNumberOfCars());

    }
}
