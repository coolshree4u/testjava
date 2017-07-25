package com.test;

public class At1 {

	public static void main(String[] args) {
		
		Thread thread1=new Thread(new MyThread());
		Thread thread2=new Thread(new MyThread());
		Thread thread3=new Thread(new MyThread());
		
		Thread [] ath={thread1, thread2, thread3};
		for(int x=0;x<3;x++)
			ath[x].start();
	}

}
