package com.simple.exam.classex2;

public class Box {
    private int width;
    private int height;
    private int length;
    private int volume;

    Box(int width) {
        this.width = width;
        this.length = 10;
        this.height = 10;
        volume = width*height*length;
    }

    Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
        volume = width*height*length;
    }

    Box() {

    }

    public int getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", volume=" + volume +
                '}';
    }

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box);
        System.out.println(box.getVolume());

        Box box1 = new Box(10,20,30);
        System.out.println(box1);
        System.out.println(box1.getVolume());

    }


}
