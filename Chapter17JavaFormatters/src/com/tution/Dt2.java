package com.tution;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Dt2 {

	public static void main(String[] args) {
		
		Date d=new Date();
		
		DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df1.format(d));
		DateFormat df2=DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df2.format(d));
		DateFormat df3=DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df3.format(d));
		DateFormat df4=DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df4.format(d));
		DateFormat df5=DateFormat.getDateInstance(DateFormat.LONG,Locale.GERMANY);
		System.out.println(df5.format(d));
		DateFormat df6=DateFormat.getDateInstance(DateFormat.LONG,Locale.ITALIAN);
		System.out.println(df6.format(d));
		DateFormat df7=DateFormat.getDateInstance(DateFormat.LONG,Locale.FRANCE);
		System.out.println(df7.format(d));
		
	}

}
