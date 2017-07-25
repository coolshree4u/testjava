package com.tution;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int x=5,y=7,z;
		
		System.out.println("x "+x+"y "+y);
		z=++x + ++y; 
		System.out.println("z=++x + ++y  " +z);
		
		
		z=x++ + y++;
		System.out.println("z=x++ + y++  " +z);
		
		z=y++ - --x + ++y - x--;
		System.out.println("z=y++ - --x + ++y - x--  " +z);
		
		
		
	}
}
