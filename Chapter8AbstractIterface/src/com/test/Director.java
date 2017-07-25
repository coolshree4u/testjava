package com.test;

public class Director {
	public static void main(String args[])
	{
		Pupil p1=new John();
		Pupil p2=new Harry();
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}
}
