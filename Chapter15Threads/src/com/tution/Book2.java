package com.tution;

public class Book2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReserveSync obj1=new ReserveSync(1);
		Thread t1=new Thread(obj1,"Ravi");
		Thread t2=new Thread(obj1,"Anil");
		t1.start();
		t2.start();
	}

}
