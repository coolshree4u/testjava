package com.tution;

public class Consumer1 implements Runnable{
	Producer1 prod;
	public Consumer1(Producer1 prod) {
		this.prod=prod;
	}
	
	@Override
	public void run() {
		synchronized (prod.sb) {
			try {
				prod.sb.wait();
			} catch (Exception e) {
				
			}
			System.out.println(prod.sb);
		}
	}
}
