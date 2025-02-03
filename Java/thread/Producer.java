package com.simple.exam.thread;

public class Producer implements Runnable{

    private Buffer buffer;

    Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("생산자:"+
                    i+"번 케익을 생산하였습니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
