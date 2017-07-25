package com.tution;

public class CirTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		Circle c2=new Circle();
		double a1,a2,a3,a4;
		
		c1.setData(2.2);
		c2.setData(1.7);
		
		a1=c1.area();
		System.out.println("Area of c1 = "+a1);
		
		a2=c2.area();
		System.out.println("Area of c2 = "+a2);
		
		a3=c1.circum();
		System.out.println("Circum of c1 = "+a3);
		
		a4=c2.circum();
		System.out.println("Circum of c2 = "+a4);
		
	}

}
