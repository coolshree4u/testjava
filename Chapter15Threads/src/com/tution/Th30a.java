package com.tution;

public class Th30a {

	public static void main(String[] args) {
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-xgenerated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2=()-> System.out.println("Thread 2");
		Thread t2=new Thread(r2);
		t2.start();
		
	}

}
