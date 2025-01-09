package com.simple.exam.extendex;

public class ColoredRectangle extends Rectangle{
    String color;

    ColoredRectangle(int x, int y, int width, int height, String color) {
        super(x, y, width, height);
        System.out.println("ColoredRectangle 생성자 호출");
        this.color = color;
    }

    public static void main(String[] args) {
        // 객체 생성
        //  Shape, Rectangle, ColoredRectangle
        //Shape shape = new Shape(10,20);
        //Shape shape1 = new Shape();

        Rectangle rectangle = new Rectangle(10, 20, 100, 200);

        ColoredRectangle coloredRectangle =
                new ColoredRectangle(10, 20, 100, 200, "red");
    }
}
