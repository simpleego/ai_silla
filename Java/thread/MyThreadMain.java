package com.simple.exam.thread;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        //MyThread myThread = new MyThread();
        //Thread myThread = new Thread(new MyRunnable());
        //Thread myThread1 = new Thread(new MyRunnable());

        Thread myThread = new Thread(new MyRunnable2("one"));
        Thread myThread1 = new Thread(new MyRunnable2("two"));

        myThread.start();
        myThread1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main : "+i);
            Thread.sleep(1000);;
        }

    }
}
