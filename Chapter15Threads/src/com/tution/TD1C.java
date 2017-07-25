package com.tution;

public class TD1C {

	public static void main(String[] args) {

		System.out.println("Main Thread Started");
		B b1=new B();
		Thread t1=new Thread(b1);
		t1.start();
		
		B b2=new B();
		Thread t2=new Thread(b2);
		t2.start();
	
		System.out.println("Main Thread Ended");
	}

}
