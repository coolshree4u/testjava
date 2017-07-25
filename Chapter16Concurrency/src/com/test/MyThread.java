package com.test;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable{
	private static AtomicInteger count=new AtomicInteger(0);
	@Override
	public void run() {
		int x=count.incrementAndGet();
		System.out.print(x+" ");
	}
}
