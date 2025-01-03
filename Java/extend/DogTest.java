package com.simple.exam.extend;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal dogAnimal = new Dog();
        Animal animal = new Animal();

        dog.sound();
        //dogAnimal.sound();

        dogAnimal.sound();
        animal.sound();
    }
}
