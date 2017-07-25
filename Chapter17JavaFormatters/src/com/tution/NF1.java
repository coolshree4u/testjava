package com.tution;

import java.text.NumberFormat;
import java.util.Locale;

public class NF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale l1=Locale.getDefault();
		
		Locale l2=new Locale("de", "DE");
		
		Locale l3=Locale.FRANCE;
		
		double d=12345678.2345;
		
		NumberFormat nf1=NumberFormat.getInstance();
		System.out.println(nf1.format(d));
		
		NumberFormat nf2=NumberFormat.getInstance(l1);
		System.out.println(l1.getCountry()+"  "+nf2.format(d));
		
		NumberFormat nf3=NumberFormat.getInstance(l2);
		System.out.println(l2.getCountry()+"  "+nf3.format(d));
		
		NumberFormat nf4=NumberFormat.getInstance(l3);
		System.out.println(l3.getCountry()+"  "+nf4.format(d));
		
		NumberFormat nf5=NumberFormat.getInstance(Locale.ITALIAN);
		System.out.println(nf5.format(d));
		
	}
}