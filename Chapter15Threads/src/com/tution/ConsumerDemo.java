package com.tution;

public class ConsumerDemo {

	public static void main(String[] args) {
		Procedure obj1=new Procedure();
		Consumer obj2=new Consumer(obj1);
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
	}
}
