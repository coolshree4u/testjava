package com.test;

public class Snooker extends CueSports implements Event {

	public static void main(String[] args) {
		Event event=new Snooker();
		CueSports obj2=new Snooker();
		System.out.println(event.getCategory()+" "+obj2.getCategory());
	}

}
