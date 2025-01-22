package com.simple.exam.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) throws InterruptedException {
     Queue<Integer> queue = new LinkedList<Integer>();
        int times = 10;
        for (int i = times; i > 0; i--) {
            queue.add(i);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.remove()+",");
            Thread.sleep(1000);
        }
    }

}
