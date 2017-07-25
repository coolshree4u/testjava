package com.test;

public class Test6 {

	public static void main(String[] args) {
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("Cat");
			}
		};

		Thread t = new Thread(run) {

			public void run() {
				System.out.println("Dog");
			}
		};

		t.start();
	}

}
