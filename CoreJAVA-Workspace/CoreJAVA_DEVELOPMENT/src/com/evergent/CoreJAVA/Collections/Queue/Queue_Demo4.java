package com.evergent.CoreJAVA.Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo4 {
	public static void main(String[] args) {
		PriorityQueue< Integer> pq = new PriorityQueue<>();
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		//pq.remove(8);
//		System.out.println(pq);
//		System.out.println(pq.peek());
pq.clear();
//pq.remove();
pq.poll();
//		System.out.println(pq);
//		
//		System.out.println(pq.poll());//used to remove top element
//		//System.out.println(pq);
		System.out.println(pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
