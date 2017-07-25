package com.tution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SCTest2 {

	public static void main(String[] args) {
		ExecutorService es2=Executors.newFixedThreadPool(2);
		es2.submit(new C1());
		es2.submit(new S1());
		es2.shutdown();
	}

}
