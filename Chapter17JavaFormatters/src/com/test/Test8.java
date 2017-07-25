package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test8 {

	public static void main(String[] args) {
		Date d = new Date(0);
		String ds = "December 15,2004";
		DateFormat df = DateFormat.getDateInstance();
		d.setTime((1000 * 24 * 60 * 60) + d.getTime());
		System.out.println(d);
		try {
			// d=df.parse(ds);
			System.out.println(df.parse(ds));
		} catch (Exception e) {
			System.out.println(e);
		}

		Date date = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM dd, yyyy");
		System.out.println(sdf2.format(date));
	}

}
