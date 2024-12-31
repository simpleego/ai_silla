package com.simple.exam.classex2;

public class RectangleEx {
    private int x,y;
    private int width, height;

    RectangleEx(int x, int y){
        this(x,y, 10, 10);
    }

    RectangleEx(int x, int width, int height){
        this(x,0,width,height);
    }

    RectangleEx(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "RectangleEx{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        RectangleEx rect = new RectangleEx(10,20);
        RectangleEx rect1 = new RectangleEx(10,20,100,200);
        RectangleEx rect2 = new RectangleEx(10,100,200);

        System.out.println(rect);
        System.out.println(rect1);
        System.out.println(rect2);
    }
}
