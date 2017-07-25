package com.tution;

public class Book1 {

	public static void main(String[] args) {
		Reserve obj1=new Reserve(1);
		Thread t1=new Thread(obj1,"Ravi");
		Thread t2=new Thread(obj1,"Anil");
		t1.start();
		t2.start();
	}
}