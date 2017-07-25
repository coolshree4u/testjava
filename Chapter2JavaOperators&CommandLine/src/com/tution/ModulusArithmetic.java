package com.tution;

public class ModulusArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Numerator less than denominator 5 and 7");
		int x=5,y=7;

		System.out.println("Numerator Positive Denominator Positive "+(x%y));
		System.out.println("Numerator Positive Denominator Negative "+(x%-y));
		System.out.println("Numerator Negative Denominator Positive "+(-x%y));
		System.out.println("Numerator Negative Denominator Negative "+(-x%-y));
		
		
		System.out.println("Numerator greater than denominator 5 and 3");
		x=5;
		y=3;

		System.out.println("Numerator Positive Denominator Positive "+(x%y));
		System.out.println("Numerator Positive Denominator Negative "+(x%-y));
		System.out.println("Numerator Negative Denominator Positive "+(-x%y));
		System.out.println("Numerator Negative Denominator Negative "+(-x%-y));
		
	}

}
