package com.test;


public class MyThread extends Thread{

	public static void main(String[] args) {
		MyThread t=new MyThread();
		Thread th=new Thread(t);
		th.start();
	}

	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("i = "+i);
		}
	}
}
