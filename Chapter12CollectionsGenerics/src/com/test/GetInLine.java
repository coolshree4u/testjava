package com.test;

import java.util.PriorityQueue;

public class GetInLine {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("banana");
		pq.add("pear");
		pq.add("apple");
		
		System.out.println(pq.poll()+" "+pq.peek());
	}
}