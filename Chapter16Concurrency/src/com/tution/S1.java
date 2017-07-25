package com.tution;

public class S1 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++){
			System.out.println(" s = "+i*i);
		}
	}
}
