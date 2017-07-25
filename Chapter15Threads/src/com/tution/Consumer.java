package com.tution;

public class Consumer implements Runnable{

	Procedure prod;
	public Consumer(Procedure prod) {
		this.prod=prod;
	}
	
	@Override
	public void run() {
		try{
			while (!prod.dpo) {
				Thread.sleep(10);
			}
		}catch (Exception e) {
		}
		System.out.println(prod.sb);
	}
}