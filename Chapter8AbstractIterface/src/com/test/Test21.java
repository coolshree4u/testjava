package com.test;

public class Test21 {

	public static void main(String[] args) {
		Rideable rideable1=new Icelandic();
		Rideable rideable2=new Horse();
		Horse horse=new Icelandic();
		System.out.println(rideable1.ride()+" "+rideable2.ride()+" "+horse.ride());
	}

}
