package com.tution;

import java.text.NumberFormat;
import java.util.Locale;

public class Nf2 {

	public static void main(String[] args) {
		double num=1234.45678;
		
		Locale india=new Locale("en","IN");
		Locale america=new Locale("en","US");
		Locale germany=new Locale("de","DE");
		
		
		NumberFormat nf1india=NumberFormat.getNumberInstance(india);
		NumberFormat nf1America=NumberFormat.getNumberInstance(america);
		NumberFormat nf1germany=NumberFormat.getNumberInstance(germany);
		
		System.out.println(nf1india.format(num));
		System.out.println(nf1America.format(num));
		System.out.println(nf1germany.format(num));
		
		
		NumberFormat nf2India=NumberFormat.getCurrencyInstance(india);
		NumberFormat nf2America=NumberFormat.getCurrencyInstance(america);
		NumberFormat nf2Germany=NumberFormat.getCurrencyInstance(germany);
		
		System.out.println(nf2India.format(num));
		System.out.println(nf2America.format(num));
		System.out.println(nf2Germany.format(num));
		
		
	}

}