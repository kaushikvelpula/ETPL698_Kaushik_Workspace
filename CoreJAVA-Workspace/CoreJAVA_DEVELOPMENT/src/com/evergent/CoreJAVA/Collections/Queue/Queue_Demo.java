package com.evergent.CoreJAVA.Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo {
	public static void main(String[] args) {
		PriorityQueue< Integer> pq = new PriorityQueue<>();
		pq.add(7);
		pq.add(2);
		pq.add(2);
		pq.add(5);
		pq.add(8);
		pq.add(5);
		System.out.println(pq);
	}

}
