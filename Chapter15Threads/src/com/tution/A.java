package com.tution;

public class A extends Thread{
	
	public void run(){
		System.out.println("Enter into thread");
		for(int i=1;i<=5;i++)
			System.out.println('a');
		System.out.println("Exit From Thread");
	}
}
