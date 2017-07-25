package com.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RC {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		Future f1=es.submit(new CallerThread("Call"));
		Future f2=es.submit(new Runner("Run"));
		String str1=f1.get().toString();
		String str2=f2.get().toString();
		System.out.println(str1);
		System.out.println(str2);
		es.shutdown();
	}

}
