package com.test;

public class Threads4a {

	public static void main(String[] args) {
		new Threads4a().go();
	}
	public void go(){
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Foo");
			}
		};
		Thread t=new Thread(r);
		t.start();
		t.start();
	}
}
