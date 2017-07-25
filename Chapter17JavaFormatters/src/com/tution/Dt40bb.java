package com.tution;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dt40bb {

	public static void main(String[] args) {
		LocalDate dt1=LocalDate.now();
		System.out.println(dt1);
		
		DateTimeFormatter dtf10=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(dtf10.format(dt1));
				
		DateTimeFormatter dtf20=DateTimeFormatter.ofPattern("dd:MM:yyyy");
		System.out.println(dtf20.format(dt1));
		
		DateTimeFormatter dtf21=DateTimeFormatter.ofPattern("MM yy dd");
		System.out.println(dtf21.format(dt1));
		
		
		String strDate="2015-08-04";
		LocalDate lda=LocalDate.parse(strDate);
		System.out.println(lda);
		
		DateTimeFormatter dtf12=DateTimeFormatter.ofPattern("dd MMM yy");
		String anotherDate="04 Aug 06";
		LocalDate lds=LocalDate.parse(anotherDate,dtf12);
		System.out.println(lds);
		
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd MMM yy");
		String anotherDate1="04 Aug 6";
		LocalDate lds1=LocalDate.parse(anotherDate1,dtf1);
		System.out.println(lds1);
		
	}

}
