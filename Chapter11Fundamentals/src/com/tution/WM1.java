package com.tution;

public class WM1 {

	public static void main(String[] args) {
		Float f = Float.valueOf("34.56");
		System.out.println("f=" + f);

		System.out.println("f=" + f.toString());
		byte b = f.byteValue();
		System.out.println("b=" + b);
		short s = f.shortValue();

		System.out.println("s=" + s);
		double d = f.doubleValue();
		System.out.println("d=" + d);
		double d1 = Double.parseDouble("7.23f");
		System.out.println("d1=" + d1);

	}
}
