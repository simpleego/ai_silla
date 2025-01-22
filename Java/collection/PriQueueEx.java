package com.simple.exam.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriQueueEx {
    public static void main(String[] args) throws InterruptedException {
     PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(20);
        queue.add(50);
        queue.add(30);
        queue.add(80);

        for (Integer num : queue){
            System.out.println(num);
        }

        while (!queue.isEmpty()){
            System.out.println(queue.remove()+",");
            Thread.sleep(1000);
        }
    }

}
