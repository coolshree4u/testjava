package com.tution;
import java.util.Scanner;

public class ScannerTokenDemo {

	public static void main(String[] args) {
		String numbers="10 20 30 40 50";
		Scanner scanNumbers=new Scanner(numbers);
		
		scanNumbers.useDelimiter(" ");
		int a,b,c;
		a=Integer.parseInt(scanNumbers.next());
		b=Integer.parseInt(scanNumbers.next());
		c=Integer.parseInt(scanNumbers.next());
		
		System.out.println("Addition of the elements in the string is "+(a+b+c));
		
		
		String whiteSpace="10w20w30w40w50";
		Scanner scanWhiteSpace=new Scanner(whiteSpace);
		scanWhiteSpace.useDelimiter("w");
		a=Integer.parseInt(scanWhiteSpace.next());
		b=Integer.parseInt(scanWhiteSpace.next());
		c=Integer.parseInt(scanWhiteSpace.next());
		
		System.out.println("Addition of the elements in the string is "+(a+b+c));
		
		String commaSeprated="10,20,30,40,50";
		Scanner scanCommaSeprated=new Scanner(commaSeprated);
		scanCommaSeprated.useDelimiter(",");
		a=Integer.parseInt(scanCommaSeprated.next());
		b=Integer.parseInt(scanCommaSeprated.next());
		c=Integer.parseInt(scanCommaSeprated.next());
		
		System.out.println("Addition of the elements in the string is "+(a+b+c));
	}

}
