package com.test;

public class Overloading {
	int x(double d,int x){
		System.out.println("One");
		return 0;
	}
	
	String x(double d){
		System.out.println("two");
		return null;
	}
	
	double x(double d, float a){
		System.out.println("three");
		return 0.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading overloading=new Overloading();
		overloading.x(10);
	}
}