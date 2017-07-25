package com.tution;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dt41c {

	public static void main(String[] args) {
		LocalTime d1 = LocalTime.now();
		System.out.println(d1);

		DateTimeFormatter f10 = DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println(f10.format(d1));

		DateTimeFormatter f20 = DateTimeFormatter.ofPattern("HH/mm/ss");
		System.out.println(f20.format(d1));

		DateTimeFormatter f21 = DateTimeFormatter.ofPattern("mm HH ss");
		System.out.println(f21.format(d1));

		String strTime = "10:11:30";
		LocalTime aLT = LocalTime.parse(strTime);
		System.out.println(aLT);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH mm ss");
		String anotherTime = "22 11 30";
		LocalTime aLT1 = LocalTime.parse(anotherTime, dtf);
		System.out.println(aLT1);

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH mm ss");
		// String anotherTime1="22 1 30";
		String anotherTime1 = "22 01 30";
		LocalTime aLT12 = LocalTime.parse(anotherTime1, dtf1);
		System.out.println(aLT12);

	}
}