package com.simple.exam.classex;

public class TelevisionMethod {
    int channel;
    int volume;
    boolean onOff;

    int volumeUp(){
        return ++volume;
    }

    int volumeDown(){
        return --volume;
    }

    @Override
    public String toString() {
        return "Television{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", onOff=" + onOff +
                '}';
    }

    public static void main(String[] args) {
        // 객체 생성
        TelevisionMethod tv1;
        tv1 = new TelevisionMethod();

        // tv 사용
        tv1.onOff = true;
        tv1.channel = 8;
        tv1.volume = 10;
        tv1.onOff = false;

        System.out.println("채널번호 :"+tv1.channel);
        System.out.println("볼륨 :"+tv1.volumeUp());
        System.out.println("전원 :"+tv1.onOff);
        System.out.println("TV : "+tv1);

        tv1.channel++;
        tv1.onOff = !tv1.onOff;
        System.out.println("채널번호 :"+tv1.channel);
        System.out.println("전원 :"+tv1.onOff);

        System.out.println("TV : "+tv1.toString());
        System.out.println("볼륨 :"+tv1.volumeDown());

    }
}
