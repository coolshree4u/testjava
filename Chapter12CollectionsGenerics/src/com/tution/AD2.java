package com.tution;

import java.util.ArrayDeque;

public class AD2 {

	public static void main(String[] args) {
		ArrayDeque<String> queue1 = new ArrayDeque<>();
		queue1.add("A");
		queue1.add("B");
		queue1.add("C");
		queue1.add("D");
		
		System.out.println(queue1.remove());
		System.out.println(queue1.peek());
		System.out.println(queue1.remove());
		System.out.println(queue1.peek());
		
		ArrayDeque<String> queue2 = new ArrayDeque<>();
		
		queue2.add("A");
		queue2.add("B");
		queue2.add("C");
		queue2.add("D");
		
		System.out.println(queue2.removeFirst());
		System.out.println(queue2.peekFirst());
		System.out.println(queue2.removeFirst());
		System.out.println(queue2.peekFirst());
	}
}