package com.test;

public class Child extends Parent{
	public int printResult(int result)
	{
		System.out.println("Inside child PrintResult");
		return result;
	}
	
	public void print(int a)
	{
		System.out.println("Child");
	}
}