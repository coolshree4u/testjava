package com.test;

public class Outer18 {
	private int x=24;
	
	public int getX(){
		String message= "x is ";
		class Inner{
			private int x=Outer18.this.x;
			public void printx(){
				System.out.println(message+x);
			}
			
		}
		Inner in=new Inner();
		in.printx();
		return x;
	}
	
	public static void main(String args[]){
		new Outer18().getX();
	}
}