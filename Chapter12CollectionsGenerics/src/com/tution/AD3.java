package com.tution;

import java.util.ArrayDeque;

public class AD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
		arrayDeque.addFirst(10);
		arrayDeque.offerFirst(20);
		arrayDeque.addLast(30);
		arrayDeque.offerLast(40);
		
		
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.peekFirst());
		System.out.println(arrayDeque.peekLast());
		System.out.println(arrayDeque.getFirst());
		System.out.println(arrayDeque.getLast());
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.pollFirst());
		System.out.println(arrayDeque.pollLast());
		System.out.println(arrayDeque.removeFirst());
		System.out.println(arrayDeque.removeLast());
		System.out.println(arrayDeque);
	}

}
