package com.tution;

import java.text.DateFormat;
import java.util.Date;

public class Dp1 {

	public static void main(String[] args) {
		try {
			Date d;
			String s1="10/27/12";
			DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT);
			d=df1.parse(s1);
			System.out.println("d = "+d);
			
			String s2="302712";
			DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG);
			d=df2.parse(s2);
			System.out.println("d = "+d);
			
		} catch (Exception e) {
			System.out.println("parse fail @ runtime");
		}
	}

}
