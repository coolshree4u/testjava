package com.tution;

import java.text.NumberFormat;

public class NF20 {

	public static void main(String[] args) {
		NumberFormat nf1=NumberFormat.getInstance();
		
		double d1=12345678.987654;
		
		double d2=1.2345;
		double d3=2;
		
		nf1.setMaximumFractionDigits(5);
		nf1.setMinimumIntegerDigits(2);
		
		System.out.println(nf1.format(d1));
		System.out.println(nf1.format(d2));
		System.out.println(nf1.format(d3));
		
		nf1.setMaximumFractionDigits(3);
		nf1.setMinimumIntegerDigits(2);
		
		System.out.println(nf1.format(d1));
		System.out.println(nf1.format(d2));
		System.out.println(nf1.format(d3));
		
	}
}