package com.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test24 {

	public static void main(String[] args) {
		//DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HHH");
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH");
		System.out.println(dtf.format(LocalTime.now()));
		
		DateTimeFormatter dateformat=DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate dob=LocalDate.of(2015, Month.APRIL, 4);
		System.out.println(dateformat.format(dob));
		System.out.println(dtf1.format(dob));
		
		LocalDate dobex=LocalDate.of(2015, Month.FEBRUARY, 31);
		System.out.println(dateformat.format(dobex));
		
	}

}
