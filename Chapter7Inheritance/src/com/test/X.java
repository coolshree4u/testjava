package com.test;

public class X {
	public X(){
		System.out.println("Inside DC of X");
	}
	public X(int x){
		this();
		System.out.println("Inside PC of X");
	}
}
