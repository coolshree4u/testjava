package com.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Test11 {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat df;
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		String s = df.format(date);
		System.out.println("United States " + s);

		df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		s = df.format(date);
		System.out.println("United States " + s);

	}

}
