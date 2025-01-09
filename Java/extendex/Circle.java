package com.simple.exam.extendex;


class Triangle extends Shape{

    Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("삼각형을 그린다.");
    }
}



public class Circle extends Shape{
    private int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그린다.");

    }

    public void calcArea(){
        System.out.println("원의 면적을 구한다.");
    }

    public static void main(String[] args) {
//        Shape circle = new Circle(10, 20, 20);
//
//        circle.move(20,30);
//        circle.draw();

        Shape s1,s2,s3,s4;

        //Shape s1 = new Shape(10,20);
        s2 = new Rectangle(10,10,100,200);
        s3 = new Triangle(10,20);
        s4 = new Circle(10,20,10);

        java.awt.Rectangle rectangle = new java.awt.Rectangle();

        s2.draw();
        s3.draw();
        s4.draw();

        System.out.println(rectangle.toString());

        System.out.println(s2.getClass());
        System.out.println(s2.getClass().getName());

        System.out.println(s2.hashCode());
        System.out.println(s2.getClass().getName());



    }
}
