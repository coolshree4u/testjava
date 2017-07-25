package com.tution;

public class CancelTicket1 implements Runnable{
	Object train,comp;
	public CancelTicket1(Object t, Object c) {
		train=t;
		comp=c;
	}
	
	@Override
	public void run() {
		synchronized (train) {
			System.out.println("Cancel Ticket Locked On Compartment");
		}
		
		try{
			Thread.sleep(150);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Cancel Ticket now waiting to lock on compartment");
		
		synchronized (comp) {
			System.out.println("Cancel Ticket locked on train");
		}
	}
}
