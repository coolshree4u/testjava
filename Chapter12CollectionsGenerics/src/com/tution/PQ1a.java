package com.tution;

import java.util.PriorityQueue;

public class PQ1a {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Alex");
		pq.add("Tom");
		pq.add("Peter");
		pq.add("Bob");
		
		System.out.println(pq.size());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		System.out.println(pq.size());
		System.out.println(pq);
		
		pq.clear();
		System.out.println(pq.size());
		System.out.println(pq);
	}

}
