package com.simple.exam.extendex;

public abstract class Shape {
    private int x;
    private int y;

    // 생성자
    Shape(int x, int y){
        System.out.println(" Shape 생성자 호출됨");
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

}
