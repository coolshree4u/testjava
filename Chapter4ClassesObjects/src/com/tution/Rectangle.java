package com.tution;

public class Rectangle {
	private int length;
	private int width;
	
	public void setData(int l, int w){
		length=l;
		width=w;
	}
	
	public int areaRect()
	{
		int area;
		area=length*width;
		return area;
	}
}
