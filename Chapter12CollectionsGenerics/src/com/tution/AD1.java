package com.tution;

import java.util.ArrayDeque;

public class AD1 {

	public static void main(String[] args) {

		ArrayDeque<String> stack1=new ArrayDeque<>();
		stack1.push("A");
		stack1.push("B");
		stack1.push("C");
		stack1.push("D");
		
		System.out.println(stack1.pop());
		System.out.println(stack1.peek());
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
		
		
		ArrayDeque<String> stack2=new ArrayDeque<>();
		stack2.addFirst("A");
		stack2.addFirst("B");
		stack2.addFirst("C");
		stack2.addFirst("D");
		
		System.out.println(stack2.removeFirst());
		System.out.println(stack2.peekFirst());
		System.out.println(stack2.peekFirst());
		System.out.println(stack2.removeFirst());
		
	}

}
