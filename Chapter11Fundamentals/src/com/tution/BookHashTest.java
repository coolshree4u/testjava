package com.tution;

public class BookHashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				BookHash b1=new BookHash(1122, "OCA");
				BookHash b2=new BookHash(1123, "CCNA");
				
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
