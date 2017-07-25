package com.tution;

public class Reserve implements Runnable {

	int available = 1;
	int wanted;

	public Reserve(int i) {
		wanted = i;
	}

	@Override
	public void run() {

		System.out.println("Available "+available);
		if(available>=wanted){
			String name=Thread.currentThread().getName();
			System.out.println(wanted+"Berth reserved for"+name);
		}
		
		try{
			Thread.sleep(1500);
			available-=wanted;
			
		}catch (Exception e) {
			System.out.println("Sorry No berth");
		}
	}

}
