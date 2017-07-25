package com.tution;

public class TD1E {

	public static void main(String[] args) {

		System.out.println("Main Thread Started");
		BA b1=new BA();
		Thread t1=new Thread(b1,"Abhishek");
		t1.start();
		
		BA b2=new BA();
		Thread t2=new Thread(b2);
		t2.setName("Abhiraj");
		t2.start();
	
		try{
			t1.join();
			t2.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Ended");
	}

}
