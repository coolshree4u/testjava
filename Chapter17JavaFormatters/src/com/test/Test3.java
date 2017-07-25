package com.test;

import java.text.NumberFormat;
import java.util.Locale;

public class Test3 {

	public static void main(String[] args) {

		NumberFormat fmt=NumberFormat.getCurrencyInstance(Locale.US);
		float f =12.344f;
		double d=56.786;
		System.out.println(fmt.format(f)+"  "+fmt.format(d));
	}

}
