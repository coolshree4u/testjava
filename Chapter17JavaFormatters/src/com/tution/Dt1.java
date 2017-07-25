package com.tution;

import java.text.DateFormat;
import java.util.Date;

public class Dt1 {

	public static void main(String[] args) {
		Date dt1=new Date();
		System.out.println(dt1);

		Date dt2=new Date();
		dt2.setTime(dt2.getTime()+(24*60*60*1000));
		System.out.println(dt2);
		
		DateFormat df1=DateFormat.getInstance();
		System.out.println(df1.format(dt1));
		
		DateFormat df2=DateFormat.getDateInstance();
		System.out.println(df2.format(dt2));
		
		DateFormat df3=DateFormat.getTimeInstance();
		System.out.println(df3.format(dt2));
		
		DateFormat df4=DateFormat.getDateTimeInstance();
		System.out.println(df4.format(dt2));
	}
}