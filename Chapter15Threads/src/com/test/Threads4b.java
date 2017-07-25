package com.test;

public class Threads4b {

	public static void main(String[] args) {
		Runnable r=()->System.out.println("run");
		Thread t=new Thread(r);
		try {
			t.start();
			t.start();
		} catch (Exception e) {
			System.out.println("exp");
		}
		System.out.println("Cont");
	}

}
