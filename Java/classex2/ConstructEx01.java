package com.simple.exam.classex2;

public class ConstructEx01 {
    private  int count;

    ConstructEx01(){
        count = 1;
        System.out.println("객체 생성시 자동 호출됩니다");
    }

    public static void main(String[] args) {
        ConstructEx01 count1 = new ConstructEx01();
        ConstructEx01 count2 = new ConstructEx01();

        System.out.println(count1.count);
        System.out.println(count2.count);
    }
}
