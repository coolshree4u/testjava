package com.test;

public class MyTarget implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("X");
		}
	}
}
