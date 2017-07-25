package com.tution;

public class TD1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Started");
		BA b1=new BA();
		Thread t1=new Thread(b1,"Abhishek");
		t1.start();
		
		BA b2=new BA();
		Thread t2=new Thread(b2);
		t2.setName("Abhiraj");
		t2.start();
	
		System.out.println("Main Thread Ended");
	}

}
