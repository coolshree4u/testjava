package com.poly;

public class Bcd extends Abc {
	public Bcd() {
		System.out.println("Inside BCD");
	}

	public Bcd(int d) {
		super(40);    //Super constructor call must be first in the Cons
		System.out.println("Inside PC of BCD");
	}
	
	public Bcd(int a, int b)
	{
		this();
		System.out.println("Inside 2nd PC of Bcd");
	}
	
	public void display(int a)
	{
		super.display(a);
		System.out.println("Inside Display of Bcd");
		super.display(a);
	}
}
