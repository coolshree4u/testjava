package com.test;

import java.time.LocalDate;
import java.time.Month;

public class Test20 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2017, 7, 22);
		System.out.println(date);
		LocalDate date1=LocalDate.of(2017, Month.JUNE, 22);
		System.out.println(date1);

		
		/*LocalDate date2=LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date2.getYear()+"  "+date2.getMonth()+" "+date2.getDayOfMonth());*/
		
		LocalDate date2=LocalDate.of(2018, Month.APRIL, 30);
		date2.plusDays(2);
		date2=date2.plusYears(3);
		
		date2=date2.plusDays(4).plusYears(-3);
		System.out.println(date2.getYear()+"  "+date2.getMonth()+" "+date2.getDayOfMonth());
	}

}
