package com.test;

public class MySecret implements Secret {

	@Override
	public String magic(double d) {
		// TODO Auto-generated method stub
		return "Poof";
	}

	public static void main(String args[]) {
		MySecret mySecret=new MySecret();
		System.out.println(mySecret.magic(10.4));
	}
}