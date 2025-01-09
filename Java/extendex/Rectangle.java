package com.simple.exam.extendex;

public class Rectangle extends Shape{
    private int width;
    private int height;

    Rectangle(int x,int y,int width, int height){
        // 상위클래스 생성자 호출
        super(x,y);
        // 자신의 멤버 초기화
        this.width = width;
        this.height = height;
        System.out.println("Rectangle 생성자 호출됨");
    }

    double clacArea(){
        return width*height;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그린다.");
    }
}
