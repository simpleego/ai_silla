package com.simple.exam.extendex;

import java.util.Objects;

class Car{
    private String model;
    Car(String model){
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            return model.equals( ((Car)obj).model );
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }
}


public class CarTest {

    public static void main(String[] args) {
        Car k5 = new Car("K5");
        Car k7 = new Car("K5");
        if(k5.equals(k7)){
            System.out.println("모델이 같다.");
        }else {
            System.out.println("모델이 다르다.");
        }
    }
}
