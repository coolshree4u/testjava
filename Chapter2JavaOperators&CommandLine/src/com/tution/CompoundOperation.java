package com.tution;

public class CompoundOperation {

	public static void main(String[] args) {

		int x=10;
		System.out.println("x=x+10 "+(x=x+10));
		System.out.println("x+=10 "+(x+=10));
		
		System.out.println("x=x*10 "+(x=x*10));
		System.out.println("x*=10 "+(x*=10));
		
		System.out.println("x=x-10 "+(x=x-10));
		System.out.println("x-=10 "+(x-=10));
		
		System.out.println("x=x/10 "+(x=x/10));
		System.out.println("x/=10 "+(x/=10));
		
		System.out.println("x=x%10 "+(x=x%10));
		System.out.println("x%=10 "+(x%=10));
	}
}