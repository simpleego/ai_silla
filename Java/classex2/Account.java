package com.simple.exam.classex2;

public class Account {
    private int regNumber;
    private String name;
    private int balance;

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 입금 메서드
    public void inMoney(int money){
        balance += money;
    }

    // 출금 메서드
    public void outMoney(int money){
        if(balance > money){
            balance -= money;
        }else {
            return;
        }
    }


    @Override
    public String toString() {
        return "Account{" +
                "regNumber=" + regNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
       Account account = new Account();
        account.setRegNumber(1234);
        account.setName("홍길동");
        account.setBalance(10000);

        System.out.println(account);
        account.inMoney(100000); // 입금 100,000원
        System.out.println(account);

        account.outMoney(100000); // 입금 100,000원
        System.out.println(account);
        System.out.println("잔액 :" +account.getBalance());

    }
}
