package com.tution;

import java.util.LinkedList;

public class LLE1a {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("C");
		ll.add("C++");
		System.out.println("Contents of Linked List "+ll);
		ll.addFirst("Java");
		System.out.println("Contents of Linked List "+ll);
		ll.addLast("Oracle");
		System.out.println("Contents of Linked List "+ll);
		ll.add("PHP");
		System.out.println("Contents of Linked List "+ll);
		ll.add(1, "AJAX");
		System.out.println("Contents of Linked List "+ll);
		ll.remove(2);
		System.out.println("Contents of Linked List "+ll);
		ll.removeFirst();
		System.out.println("Contents of Linked List "+ll);
		ll.removeLast();
		System.out.println("Contents of Linked List "+ll);
	}

}
