package com.simple.exam.extend;

public class Shape {
    private int x;
    protected int y;

    Shape(){
        System.out.println("기본 생성자 호출됨...");
    }

    Shape(String msg){
        System.out.println("Shape생성자 () "+msg);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    protected int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
