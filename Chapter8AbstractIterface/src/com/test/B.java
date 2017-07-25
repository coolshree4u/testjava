package com.test;

public class B extends A {
	static int a=7;
	String doA(){
		return "b1";
	}
	protected static String doA2()
	{
		return "b2";
	}
	
	void go(){
		A myA=new B();
		System.out.println(myA.doA()+myA.doA2()+myA.a);
	}
	
	public static void main(String args[])
	{
		new B().go();
	}
}
