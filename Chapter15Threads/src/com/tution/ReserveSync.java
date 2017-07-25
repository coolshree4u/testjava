package com.tution;

public class ReserveSync implements Runnable {
	int available = 1;
	int wanted;

	public ReserveSync(int i) {
		wanted = i;
	}

	@Override
	synchronized public void run() {

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
