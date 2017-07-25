package com.tution;

import java.time.LocalTime;

public class Dt41a {

	public static void main(String[] args) {
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		
		LocalTime t2=LocalTime.of(14, 20,25,40);
		System.out.println(t2);
		
		LocalTime t3=LocalTime.of(10, 20);
		System.out.println(t3);
		
		LocalTime t4=LocalTime.of(15,23);
		System.out.println(t4);
		
	}

}
