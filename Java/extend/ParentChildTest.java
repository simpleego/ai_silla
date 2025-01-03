package com.simple.exam.extend;
class Parent{
    public void print(){
        System.out.println("부모클래스 print()");
    }
}

class Child extends Parent{

    public void print(){
        //super.print();
        System.out.println("자식 클래스 print()");
    }

    public void show(){
        print();
    }
}

public class ParentChildTest {
    public static void main(String[] args) {
        Child child = new Child();

        //child.print();
        child.show();
    }
}
