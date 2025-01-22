package com.simple.exam.thread;

public class MyRunnable implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("출력"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
