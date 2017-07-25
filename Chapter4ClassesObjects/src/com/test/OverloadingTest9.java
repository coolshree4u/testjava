package com.test;

public class OverloadingTest9 {
	void x(double d,int x){
		System.out.println("One");
	}
	
	void x(double d){
		System.out.println("two");
	}
	
	void x(double d, float a){
		System.out.println("three");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading overloading=new Overloading();
		overloading.x(10);
	}
}