package com.tution;

public class Dead2 {

	public static void main(String[] args) {
		Object train=new Object();
		Object compartment=new Object();
		
		BookTicket1 obj1=new BookTicket1(train, compartment);
		CancelTicket1 obj2=new CancelTicket1(train, compartment);
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
	}

}
