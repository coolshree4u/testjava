package com.ch17;

import java.text.NumberFormat;

public class Test1 {

	public static void main(String[] args) {
		NumberFormat nf=NumberFormat.getInstance();
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(4);
		
		String a=nf.format(1234.5678121);
		String b=nf.format(2);
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
