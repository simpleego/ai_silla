package com.simple.exam.interfaceex;

public class FruitSeller {
    int numOfApple = 20;
    int myMoney = 0;
    final int APPLE_PRICE=1000;

    public int saleApple(int money){
        int num = money/APPLE_PRICE;
        numOfApple -= num;
        myMoney += money;
        showApples();
        return num;
    }

    public void showApples(){
        System.out.println("과일 : 사과"+"("+APPLE_PRICE+"원)");
        System.out.println("과일 : 남은 사과 수량 : "+"("+numOfApple+"개)");
    }

    public void showResult(){
        System.out.println("매출금액 : "+"("+myMoney+"원)");
        System.out.println("과일 : 남은 사과 수량 : "+"("+numOfApple+"개)");
    }
}
