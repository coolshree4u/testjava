package com.test;

import java.util.PriorityQueue;

public class Priorities {

	public static void main(String[] args) {
		PriorityQueue<String> toDo=new PriorityQueue<>();
		toDo.add("dishes");
		toDo.add("laundry");
		toDo.add("bills");
		toDo.add("bills");
		
		System.out.println(toDo.size()+" "+toDo.poll());
		System.out.println(""+toDo.peek()+" "+toDo.poll());
		System.out.println(""+toDo.poll()+" "+toDo.poll());
	}
}