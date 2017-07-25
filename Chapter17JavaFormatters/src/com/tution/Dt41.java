package com.tution;

import java.time.LocalTime;

public class Dt41 {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		int h=t1.getHour();
		int m=t1.getMinute();
		int s=t1.getSecond();
		int n=t1.getNano();
		
		System.out.println(h+" "+m+" "+s+" "+n);
		
		System.out.println(t1.plusHours(1));
		System.out.println(t1.minusHours(3));
		
		System.out.println(t1.plusMinutes(1));
		System.out.println(t1.minusMinutes(3));
		
		System.out.println(t1.plusSeconds(1));
		System.out.println(t1.minusSeconds(3));
		
		System.out.println(t1.plusNanos(1));
		System.out.println(t1.minusNanos(3));
	}

}
