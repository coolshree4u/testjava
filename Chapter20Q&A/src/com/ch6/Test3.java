package com.ch6;

public class Test3 {

	public static void main(String[] args) {
		String product = "Pen";
		product=product.toLowerCase();
		product=product.concat("Box".toLowerCase());
		System.out.println(product.substring(4, 6));
	}
}
