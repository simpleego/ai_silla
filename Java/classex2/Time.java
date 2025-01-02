package com.simple.exam.classex2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(){
        this(0,0,0);
    }

    Time(int hour, int minute, int second) {
        this.hour = ((hour>=0 && hour <= 24)?hour:0);
        this.minute = ((minute>=0 && minute<=60)?minute:0);
        this.second = ((second>=0 && second<=60)?second:0);
    }

    @Override
    public String toString() {
        return
                String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time);

        Time time1 = new Time(13,16,4);
        System.out.println(time1);

        Time time2 = new Time(26,69,4);
        System.out.println(time2);


    }
}
