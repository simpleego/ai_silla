package com.simple.exam.extend;

public class Bank {
    double getInterestRate(){
            return 1.1;
    }

    public static void main(String[] args) {
        BadBank badBank = new BadBank();
        NormalBank normalBank = new NormalBank();
        Bank goodBank = new GoodBank();

        System.out.println("BadBank 이율:"+badBank.getInterestRate());
        System.out.println("NormalBank 이율:"+normalBank.getInterestRate());
        System.out.println("GoodBank 이율:"+goodBank.getInterestRate());

    }
}

class BadBank extends Bank {
    @Override
    double getInterestRate() {
        return 10.0;
    }
}

class NormalBank extends Bank{
    @Override
    double getInterestRate() {
        return 5.0;
    }
}

class GoodBank extends Bank{

    double getInterestRate1() {
        return 3.0;
    }
}