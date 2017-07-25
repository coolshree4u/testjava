package com.tution;

public class RectangleCon {
	private int length;
	private int width;
	
	public RectangleCon() {
		length=0;
		width=0;
	}
	
	public RectangleCon(int i){
		length=width=i;
	}
	public RectangleCon(int l, int w){
		length=l;
		width=w;
	}
	
	public int areaRect(){
		return length*width;
	}
}
