package com.test;

public class B {
	public void process() throws Exception
	{
		System.out.println("B");
	}
	public static void main(String[] args) {

		try {
			new B().process();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
