package com.test;

import java.text.NumberFormat;

public class Test4 {

	public static void main(String[] args) {
		NumberFormat nf1=NumberFormat.getPercentInstance();
		System.out.println(nf1.format(1));
		NumberFormat nf2=NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(4);
		System.out.println(nf2.format(9867543.123456));
		
	}

}
