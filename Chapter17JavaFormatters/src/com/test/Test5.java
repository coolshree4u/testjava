package com.test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Test5 {

	public static void main(String[] args) throws ParseException {
		NumberFormat nf1=NumberFormat.getInstance(Locale.FRANCE);
		String value="444,33";
		System.out.println(nf1.parse(value));
		
		
		double input=314159.29;
		NumberFormat nf2=NumberFormat.getInstance(Locale.ITALIAN);
		String b;
		b=nf2.format(input);
		System.out.println(b);
		
		
		DateFormat df=DateFormat.getDateInstance();
		Date date=new Date();
		String s =df.format(date);
		System.out.println(s);
	}

}
