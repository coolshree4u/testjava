package com.practice;

public class MessageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Started with Norman");
		A1 a=new A1();
		a.message();
		
		B1 b=new B1();
		b.message();
		
		C1 c=new C1();
		c.message();
		
		
		
		System.out.println("Started With Polymorphic reference");
		a=new B1();
		a.message();
		
		a=new C1();
		a.message();
	}

}
