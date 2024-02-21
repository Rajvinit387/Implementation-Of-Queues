package com.example.demo;

import com.example.demo.services.UpstashQueue;
import com.example.demo.services.priorityQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.PriorityQueue;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		priorityQueue.enqueuePQ(pq,1);
		priorityQueue.enqueuePQ(pq,1);
		priorityQueue.enqueuePQ(pq,2);
		priorityQueue.enqueuePQ(pq,3);
		System.out.println(priorityQueue.dequeuePQ(pq));
		System.out.println(priorityQueue.dequeuePQ(pq));
		System.out.println(priorityQueue.dequeuePQ(pq));
		System.out.println(priorityQueue.sizePQ(pq));
		System.out.println(priorityQueue.isemptyPQ(pq));
		}

	}

