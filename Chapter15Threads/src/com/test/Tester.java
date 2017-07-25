package com.test;

public class Tester implements Runnable{
	static PingPong2 pp2=new PingPong2();
	@Override
	public void run() {
		pp2.hit(Thread.currentThread().getId());
	}
	public static void main(String args[]){
		new Thread(new Tester()).start();
		new Thread(new Tester()).start();
	}
}
