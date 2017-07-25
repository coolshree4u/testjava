package com.test;

public class A {
	private static int counter=0;
	public A() {
		counter++;
	}
	public static int getInstanceCount(){
		return counter;
	}
}