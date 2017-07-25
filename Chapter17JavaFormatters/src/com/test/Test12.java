package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test12 {

	public static void main(String[] args) {
		Date d=new Date();
		String ds="December 15, 2004";
		DateFormat df=DateFormat.getDateInstance();
		try {
			d=df.parse(ds);
		} catch (ParseException e) {
			System.out.println(e);
		}
		
		
		SimpleDateFormat sdf;
		sdf=new SimpleDateFormat("MMM",Locale.UK);
		System.out.println("Result "+sdf.format(d));
		
		sdf=new SimpleDateFormat("MMMM",Locale.UK);
		System.out.println("Result "+sdf.format(d));
	}

}
