package com.simple.exam.thread;

public class Consumer implements Runnable{

    private Buffer buffer;

    Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.get();
            System.out.println("소비자:"+
                    i+"번 케익을 소비했습니다.");
            try {
                Thread.sleep((int)(Math.random()*200));
            } catch (InterruptedException e) {
            }
        }
    }
}
