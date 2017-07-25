package com.lecture;

public class D1Impl {
	public static void main(String[] args) {
		D1 p1=()-> System.out.println("Hello1");
		p1.greet();
		
		D1 p2=()->{System.out.println("Hello2");};
		p2.greet();
		
		D1 p3=()->{System.out.println("Hello3"); System.out.println("Hello4");};
		p3.greet();
	}
}