package com.test;

public class Test15 {

	public static void main(String[] args) throws InterruptedException {
		Runnable r=()-> System.out.println("Do Something");
		Thread t=new Thread(r);
		t.start();
		t.join();
		System.out.println("else");
	}
}