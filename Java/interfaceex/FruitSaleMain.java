package com.simple.exam.interfaceex;

public class FruitSaleMain {
    public static void main(String[] args) {
        FruitSeller fruitSeller = new FruitSeller();
        FruitBuyer fruitBuyer = new FruitBuyer();

        fruitSeller.showApples();
        fruitBuyer.buyApple(fruitSeller,2000);

    }
}
