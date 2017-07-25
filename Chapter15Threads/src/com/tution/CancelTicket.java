package com.tution;

public class CancelTicket implements Runnable{
	Object train,comp;
	public CancelTicket(Object t, Object c) {
		train=t;
		comp=c;
	}
	
	@Override
	public void run() {
		synchronized (comp) {
			System.out.println("Cancel Ticket Locked On Compartment");
		}
		
		try{
			Thread.sleep(150);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Cancel Ticket now waiting to lock on compartment");
		
		synchronized (train) {
			System.out.println("Cancel Ticket locked on train");
		}
	}
}
