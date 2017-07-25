package com.tution;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1122, "OCA");
		Book b2=new Book(1122, "CCNA");
		
		System.out.println(b1.getClass());
		System.out.println(b2.getClass());
		
		System.out.println(b1+"   "+b1.toString());
		System.out.println(b2+"   "+b2.toString());
		
		if(b1.equals(b2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
