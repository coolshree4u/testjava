package com.ch17;

import java.time.LocalDate;
import java.time.Month;

public class Test3 {

	public static void main(String[] args) {
		LocalDate valentinesDay=LocalDate.of(2015, Month.FEBRUARY, 14 );
		LocalDate nextYear=valentinesDay.plusYears(1);
		
		nextYear.plusDays(15);
		System.out.println(nextYear);
		
		nextYear=nextYear.plusDays(15);
		System.out.println(nextYear);
	}

}
