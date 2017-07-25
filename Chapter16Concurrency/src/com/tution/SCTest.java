package com.tution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SCTest {

	public static void main(String[] args) {
		ExecutorService es1=Executors.newFixedThreadPool(1);
		es1.submit(new C1());
		es1.submit(new S1());
		es1.shutdown();
		
		
	}

}
