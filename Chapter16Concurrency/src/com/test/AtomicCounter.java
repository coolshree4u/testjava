package com.test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
	private AtomicInteger c=new AtomicInteger(0);
	public void increment(){
		System.out.println(c.getAndIncrement());
	}
}
