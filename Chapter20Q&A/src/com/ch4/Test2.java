package com.ch4;

public class Test2 {
	static void changePayLoad(PayLoad p){
		p.setWeight(420);
		//p=new PayLoad(420);
	}
	
	public static void main(String args[]){
		PayLoad p=new PayLoad(200);
		p.setWeight(1024);
		changePayLoad(p);
		System.out.println("p is "+p.getWeight());
	}
}