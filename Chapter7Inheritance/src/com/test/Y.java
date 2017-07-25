package com.test;

public class Y extends X{
	public Y()
	{
		super();
		System.out.println("Inside DC Of Y");
	}
	public Y(int a)
	{
		this();
		System.out.println("Inside PC Of Y");
	}
	
	public static void main(String... args)
	{
		new Y(10);
	}
}