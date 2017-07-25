package com.test;

public class PrintX {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTarget target=new MyTarget();
		Thread t=new Thread(target);
		t.start();
		System.out.println("y");
	}
}