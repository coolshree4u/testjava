package com.tution;

public class Circle {
	private double r;
	
	public void setData(double d){
		r=d;
	}
	public double area(){
		double areaAns=3.14*r*r;
		return areaAns;
	}
	
	public double circum(){
		double cirAns=2*3.14*r;
		return cirAns;
	}
}
