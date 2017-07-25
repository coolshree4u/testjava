package com.practice;

public class ABTest implements A,B {
	

	@Override
	public void method() {
		System.out.println("A.x = "+A.x+"\nB.x = "+B.x);
	}
	public static void main(String args[]) {
		ABTest obj=new ABTest();
		obj.method();
		
		A objA=new ABTest();
		objA.method();
		
	}
}