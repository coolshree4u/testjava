package com.test;

public class ChildOverload extends ParentOverload{
	public void print(int d) {
		// TODO Auto-generated method stub
		System.out.println("Chiled Overload");
	}
	
	public static void main(String[] args) {
		ChildOverload childOverload=new ChildOverload();
		childOverload.print(3.14d);
		childOverload.print(10);
		
	}

}
