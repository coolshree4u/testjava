package com.tution;

public class Procedure implements Runnable{

	StringBuffer sb;
	boolean dpo=false;
	
	public Procedure() {
		sb=new StringBuffer();
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			try {
				sb.append(i+":");
				Thread.sleep(100);
				System.out.println("Appending "+i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		dpo=true;
	}
}