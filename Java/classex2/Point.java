package com.simple.exam.classex2;

public class Point {
    private int x;
    private int y;

    Point(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("점이 생성됩니다.");
    }

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
