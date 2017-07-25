package com.tution;

public class TD1B {

	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		A a1=new A();
		Thread t1=new Thread(a1);
		t1.start();
		
		A a2=new A();
		Thread t2=new Thread(a2);
		t2.start();
	
		System.out.println("Main Thread Ended");
	}

}
