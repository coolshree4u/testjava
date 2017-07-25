package com.lecture;

public class E1Impl {
	public static void main(String args[]) {
		E1 p1= (String str) -> {return str.length();};
		int len1=p1.getStLe("Mumbai");
		System.out.println("Length is "+len1);
		
		
		E1 p2= (str) -> {return str.length();};
		int len2=p2.getStLe("Pune");
		System.out.println("Length is "+len2);
		
		
		E1 p3= str -> {return str.length();};
		int len3=p3.getStLe("Thane");
		System.out.println("Length is "+len3);
		
		
		E1 p4= str -> str.length();
		int len4=p4.getStLe("Ahmadnagar");
		System.out.println("Length is "+len4);
		
		E1 p5= (str) -> str.length();
		int len5=p5.getStLe("Aurangabad-Phase2");
		System.out.println("Length is "+len5);
		
		
		E1 p6= (String str) -> str.length();
		int len6=p6.getStLe("AamchoKokan");
		System.out.println("Length is "+len6);
	}
}