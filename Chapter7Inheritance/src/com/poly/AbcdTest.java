package com.poly;

public class AbcdTest {
	public static void main(String... a){
		Abc abc=new Abc();
		abc.display(10);
		
		Bcd bcd=new Bcd();
		bcd.display(10);
		
		Bcd bcd2=new Bcd(10);
		
		Bcd bcd3=new Bcd(10, 20);
	}	
}