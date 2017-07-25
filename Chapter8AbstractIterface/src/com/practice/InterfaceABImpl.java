package com.practice;

public class InterfaceABImpl implements A,B{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceABImpl in= new InterfaceABImpl();
		in.method();
	}

	@Override
	public void method() {
		System.out.println("A's x= "+A.x+" B's x="+B.x);
	}

}
