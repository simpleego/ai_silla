package com.simple.exam.classex2;

public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
        System.out.println("원이 생성됩니다.");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    public static void main(String[] args) {

        Point point = new Point(10,20);
        Circle circle = new Circle(point, 10);
        System.out.println(circle);
    }
}
