package com.tution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class F1Test {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		try {
			F1 f5=new F1(5);
			Future r5=es.submit(f5);
			long l5=(Long)r5.get();
			System.out.println(l5);
			
			F1 f6=new F1(6);
			Future r6=es.submit(f6);
			long l6=(Long)r6.get();
			System.out.println(l6);
			
			F1 f7=new F1(-5);
			Future r7=es.submit(f7);
			long l7=(Long)r7.get();
			System.out.println(l7);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		es.shutdown();
	}

}
