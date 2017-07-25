package com.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque=new ArrayDeque<>(2);
		
		deque.addFirst("One");
		deque.addFirst("Two");
		deque.addFirst("Three");
		
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
	}
}