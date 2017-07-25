package com.tution;

import java.time.LocalDate;
import java.time.Month;

public class Dt40ab {

	public static void main(String[] args) {
		LocalDate d1=LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2=LocalDate.of(2014, Month.JANUARY, 25);
		System.out.println(d2);
		
		LocalDate d3=LocalDate.of(2014, 1, 25);
		System.out.println(d3);
		
		LocalDate d4=LocalDate.of(2014, 2, 29);
		System.out.println(d4);
	}

}
