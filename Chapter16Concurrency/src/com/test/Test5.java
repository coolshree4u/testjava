package com.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newFixedThreadPool(4);
		Future f1=es.submit(new CallerThread("Call"));
		String str=f1.get().toString();
		System.out.println(str);
		es.shutdown();
	}
}