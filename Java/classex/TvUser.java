package com.simple.exam.classex;

public class TvUser {

    public static void main(String[] args) {
       Tv myTv = new Tv();

       myTv.onOff = true;

       myTv.setChannel(11);
       myTv.volumeUp();
       myTv.volumeUp();
       myTv.setChannel(9);
       myTv.volumeUp();
    }
}
