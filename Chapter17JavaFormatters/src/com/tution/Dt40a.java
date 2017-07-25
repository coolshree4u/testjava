package com.tution;

import java.time.LocalDate;
import java.time.Month;

public class Dt40a {

	public static void main(String[] args) {
		LocalDate dt1=LocalDate.now();
		System.out.println(dt1);
		
		int y=dt1.getYear();
		int m=dt1.getMonthValue();
		int d=dt1.getDayOfMonth();
		
		Month mn=dt1.getMonth();
		boolean ly=dt1.isLeapYear();
		System.out.println(d+" "+m+" "+y+" "+mn+" "+ly);
		
		System.out.println(dt1.plusYears(3));
		System.out.println(dt1.minusYears(4));
		System.out.println(dt1.plusYears(-1));
		System.out.println(dt1.minusYears(-3));
		System.out.println(dt1.plusMonths(10));
		System.out.println(dt1.minusMonths(10));
		System.out.println(dt1.plusMonths(-10));
		System.out.println(dt1.minusMonths(-10));
		System.out.println(dt1.plusWeeks(10));
		System.out.println(dt1.minusWeeks(10));
		
		System.out.println(dt1.plusDays(10));
		System.out.println(dt1.minusDays(10));
		
		
	}

}
