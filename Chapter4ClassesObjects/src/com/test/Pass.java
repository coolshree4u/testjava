package com.test;

public class Pass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		Pass p=new Pass();
		p.doStuff(x);
		System.out.println("Main x = "+x);
	}

	public void doStuff(int x) {
		System.out.println("doStuff x = "+x++);
	}
}