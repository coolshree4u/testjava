package com.tution;

import java.util.concurrent.atomic.AtomicInteger;

public class AI1 {

	public static void main(String[] args) {
		AtomicInteger a1=new AtomicInteger();
		System.out.println(a1.get());
		
		a1.set(150);
		System.out.println(a1.get());
		
		AtomicInteger a2=new AtomicInteger(200);
		System.out.println(a2.get());
		
		a2.compareAndSet(200, 450);
		System.out.println(a2.get());
		
		a2.compareAndSet(200, 350);
		System.out.println(a2.get());
		
		a2.compareAndSet(450, 350);
		System.out.println(a2.get());
	}
}