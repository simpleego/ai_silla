package com.simple.exam.interfaceex;

public class FruitBuyer {
    int numOfApples=0;
    int myMoney = 5000;

    public void buyApple(FruitSeller fruitSeller, int money){
        numOfApples += fruitSeller.saleApple(money);
        myMoney -= money;
        showBuyResult();
    }

    public  void showBuyResult(){
        System.out.println("내 돈 : "+"("+myMoney+"원)");
        System.out.println("과일 수량 : "+"("+numOfApples+"개)");
    }
}
