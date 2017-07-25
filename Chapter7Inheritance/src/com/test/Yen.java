package com.test;

public class Yen extends Money{
	public String getC()
	{
		return super.getC();
	}
	
	public static void main(String[] args)
	{
		System.out.println(new Yen().getC()+"   "+new Ruppeeeeee().getC());
	}
}
