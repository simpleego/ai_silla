package com.simple.exam.thread;

public class SyncronizedEx {
    public static void main(String[] args) {
        ShardBoard board = new ShardBoard();
        Thread th1 = new StudentThread("기태",board);
        Thread th2 = new StudentThread("영미",board);

        th1.start();
        th2.start();
    }
}

class ShardBoard{
    private int sum=0;
    public synchronized  void add() throws InterruptedException {
        int n = sum;
        //Thread.yield();  // 현재 실행중인 스레드를 양보
        Thread.sleep(50);
        n += 10; // 10씩 증가
        sum = n;
        System.out.println(Thread.
                currentThread().
                getName()
                + ":" + sum
        );
    }
    public int getSum(){
        return sum;
    }
}

class StudentThread extends Thread {
    private  ShardBoard board;
    StudentThread(String name, ShardBoard board){
        super(name);
        this.board = board;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                board.add();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

