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

    Box whoLargest(Box box1, Box box2){
        if(box1.volume > box2.volume){
            return box1;
        }else {
            return box2;
        }
    }
    boolean isSameBox(Box box){
        if ( (box.width == width)&&(box.height == height) ){
            //
            return true;
        }else {
            //
            return false;
        }
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

        // 박스 비교
        Box box01 = new Box(10,30,30);
        Box box02 = new Box(10,30,30);
        Box largest = box01.whoLargest(box1,box02);
        System.out.println("더 큰 박스는 : "+largest);

        // 박스가 같은지 비교
        System.out.println("박스가 같은가요? : "+(box01.isSameBox(box02)?"예":"아니오"));
    }
}
