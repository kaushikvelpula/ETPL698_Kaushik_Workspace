package com.evergent.CoreJAVA.Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo3 {
	public static void main(String[] args) {
		Queue< Integer> pq = new PriorityQueue<>();
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
	//	pq.clear();
		//System.out.println(pq);
		
		System.out.println(pq.poll());//used to remove top element
		//System.out.println(pq);
	}

}
