package com.test;

public class MySub extends MySuper{
	public MySub(String str)
	{
		super();
		System.out.println("Inside MySub");
	}
	
	public static void main(String... args)
	{
		new MySub("Abhishek");
	}
}
