package com.simple.exam.extend;

public class Rectangle extends Shape{
    int width;
    int height;

    Rectangle(){
        super("멋진 모양을 만들어줘..");
        System.out.println("Rectangle 생성자()");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    double area(){
        return (double) width*height;
    }
    void draw() {
        System.out.println("("+getX()+","+y+")"+getY());
        System.out.println("("+width+","+height+")");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x : " + getX()+
                "y : " + getY()+
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
