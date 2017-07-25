package com.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test27 {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.parse("2018-04-30",DateTimeFormatter.ISO_LOCAL_DATE);
		ld.plusDays(10);
		//ld.plusHours(3);
		System.out.println(ld.getYear()+" "+ld.getMonthValue()+" "+ld.getDayOfMonth());

		
		DateTimeFormatter fromFormat=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter todateFormat=DateTimeFormatter.ofPattern("dd/MMM/yy");
		LocalDate firstOct2015=LocalDate.parse("01/10/2015",fromFormat);
		System.out.println(firstOct2015.format(todateFormat));
	}

}
