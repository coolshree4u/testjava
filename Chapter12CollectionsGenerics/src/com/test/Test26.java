package com.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test26 {

	public static void main(String[] args) {
		Deque<String> deque=new ArrayDeque<>();
		deque.push("One");
		deque.push("Two");
		deque.push("Three");
		System.out.println(deque.pop());
		
		System.out.println(deque.remove());
		System.out.println(deque);
	}

}
