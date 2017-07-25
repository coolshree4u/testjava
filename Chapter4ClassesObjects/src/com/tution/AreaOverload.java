package com.tution;

public class AreaOverload {
	public float area(float length,float width){
		return length*width;
	}
	
	public float area(float radius){
		return (float)(3.14*radius*radius);
	}
}
