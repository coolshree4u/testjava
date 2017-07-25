package com.test;

public class Test16 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<4;i++){
			System.out.print(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(new Test16());
		t.start();
		System.out.print("Started");
		t.join();
		System.out.print("Complete");	
	}
}