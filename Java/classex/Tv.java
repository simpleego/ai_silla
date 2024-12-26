package com.simple.exam.classex;

public class Tv {
    int channel=1;
    int volume=1;
    boolean onOff=true;

    public void volumeUp(){
        volume++;
        showVolume();
    }

    private void showVolume() {
        System.out.println("볼륨: "+volume);
    }

    public void volumeDown(){
        volume--;
        showVolume();
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        showChannel();
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    void showChannel(){
        System.out.println("현재 채널 :"+channel);
    }

    @Override
    public String toString() {
        return "Television{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", onOff=" + onOff +
                '}';
    }
}
