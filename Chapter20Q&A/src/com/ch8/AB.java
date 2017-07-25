package com.ch8;

public abstract class AB {
	private void doSomething() {
		System.out.println("A");
	}
	
	public static void main(String args[]){
		AB ab=new BA();
		ab.doSomething();
	}
}
