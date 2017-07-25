package com.tution;

import java.util.concurrent.atomic.AtomicInteger;

public class AI2 {

	public static void main(String[] args) {
		AtomicInteger a3=new AtomicInteger(50);
		System.out.println(a3.getAndAdd(10));
		System.out.println(a3.addAndGet(15));
		
		AtomicInteger a4=new AtomicInteger(70);
		int ia1=a4.getAndIncrement();
		System.out.println(ia1);
		
		int ia2=a4.incrementAndGet();
		System.out.println(ia2);
		
		
		int ia3=a4.getAndDecrement();
		System.out.println(ia3);
		
		int ia4=a4.decrementAndGet();
		System.out.println(ia4);
		
	}
}