package com.test;

public class ChildOverride extends ParentOverride {
	/*public double computePay(double d)
	{
		System.out.println("Inside ParentOverride");
		return 0.0f;
	}   if override is there then return type of the method must be same*/
	
	public static void main(String args[])
	{
		System.out.println(new ChildOverride().computePay(0.0));
	}
}
