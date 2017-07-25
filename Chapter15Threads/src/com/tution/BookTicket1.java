package com.tution;

public class BookTicket1 implements Runnable{
	Object train,comp;
	public BookTicket1(Object t, Object c) {
		train=t;
		comp=c;
	}
	
	@Override
	public void run() {
		synchronized (train) {
			System.out.println("Book Ticket Locked On train");
		}
		
		try{
			Thread.sleep(150);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Book Ticket now waiting to lock on compartment");
		
		synchronized (comp) {
			System.out.println("Book Ticket locked on compartment");
		}
	}
}
