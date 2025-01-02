package com.simple.exam.classex2;

public class OuterClass {
    private int value = 10;

    OuterClass(){
        System.out.println("Outer 생성자 호출됩니다.");
        InnerClass obj = new InnerClass();
        obj.myMethod();
    }
    class InnerClass {
        public void myMethod(){
            System.out.println("외부멤버 변수 : "+value);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
    }

}


