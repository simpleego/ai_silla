package com.simple.exam.thread;

public class ThreadInfoEx {
    public static void main(String[] args) {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        Thread.State state = Thread.currentThread().getState();

        System.out.println("아이디:"+id);
        System.out.println("이름:"+name);
        System.out.println("우선순위:"+priority);
        System.out.println("상태:"+state);
    }
}
