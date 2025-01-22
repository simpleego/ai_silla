package com.simple.exam.thread;

public class MyRunnable2 implements Runnable{
    String name;
    public MyRunnable2(String name){
       this.name = name;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name+": 출력"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
