package com.tution;

public class RectTest {
	public static void main(String[] args) {
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle();
		
		int a1,a2;
		
		rect1.setData(20, 15);
		rect2.setData(20, 17);
		
		a1=rect1.areaRect();
		System.out.println("Area of First Rect is : "+a1);
		
		a2=rect2.areaRect();
		System.out.println("Area of Second Rect is : "+a2);
		
	}
}