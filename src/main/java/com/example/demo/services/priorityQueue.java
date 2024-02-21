package com.example.demo.services;
import org.springframework.stereotype.Service;

import java.util.*;



public class priorityQueue {
     //PriorityQueue<Integer> pqueue= new PriorityQueue<>();
    public static int enqueuePQ(PriorityQueue<Integer> priorityQueue,int x)
    {
        priorityQueue.add(x);
        return x;
    }

    public static int dequeuePQ(PriorityQueue<Integer> priorityQueue)
    {
        return priorityQueue.poll();
    }

    public static int sizePQ(PriorityQueue <Integer> priorityQueue)
    {
        return priorityQueue.size();
    }


    public static boolean isemptyPQ(PriorityQueue<Integer> priorityQueue)
    {
        return 0==priorityQueue.size();
    }
}
