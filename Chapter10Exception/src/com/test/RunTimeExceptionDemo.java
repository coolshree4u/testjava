package com.test;

public class RunTimeExceptionDemo {

	public static void test()
	{
		try{
			System.out.println("test");
			throw new RuntimeException();
		}catch (Exception e) {
			System.out.println("Exception");
		}
		
	}
	public static void main(String[] args) {
		try{
			test();
		}catch (Exception e) {
			System.out.println("inside Exception");
		}
		System.out.println("End");
	}


}
