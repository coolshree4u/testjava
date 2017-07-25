package com.test;

public class PrapogationTest2 {
public static void test()
{
	try{
		System.out.println("Inside Test");
		throw new RuntimeException();
	}catch (Exception e) {
		System.out.println("Inside Runtime of method");
	}
}

	public static void main(String[] args) {
		try{
			test();
		}catch (RuntimeException e) {
			System.out.println("Inside Runtime of Main");
		}
	}

}
