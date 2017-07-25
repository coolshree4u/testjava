package com.tution;

public class RectangleConTest {

	public static void main(String[] args) {

		RectangleCon rc1=new RectangleCon();
		RectangleCon rc2=new RectangleCon(20,15);
		RectangleCon rc3=new RectangleCon(20);
		
		System.out.println("Area of the First rectangle "+rc1.areaRect());
		System.out.println("Area of the Second rectangle "+rc2.areaRect());
		System.out.println("Area of the Third rectangle "+rc3.areaRect());
	}

}
