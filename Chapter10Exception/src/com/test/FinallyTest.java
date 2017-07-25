package com.test;

public class FinallyTest {

	public static void test()
	{
		try{
			String str=null;
			System.out.println(str.toString());
		}
		finally {
			System.out.println("Inside Finally");
		}
	}
	public static void main(String[] args) {
		try{
			test();
		}catch (Exception e) {
			System.out.println("inside Exception");
		}
	}

}
