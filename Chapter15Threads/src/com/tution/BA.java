package com.tution;

public class BA implements Runnable{
	@Override
	public void run() {
		System.out.println("Enter into thread"+Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++)
		try{
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exit From Thread"+Thread.currentThread().getName());
	}
}
