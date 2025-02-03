package com.simple.exam.thread;

public class ConsummerThread extends Thread {
    MyLabel bar;

    public ConsummerThread(MyLabel bar) {
        this.bar = bar;
    }

    @Override
    public void run() {

        while (true){
            try {
                sleep(200);
                bar.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
