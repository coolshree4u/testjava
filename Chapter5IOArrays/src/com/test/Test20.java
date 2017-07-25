package com.test;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a[]={65,66,67,68,69,70};
		byte b[]={71,72,73,74,75,76};
		System.arraycopy(a, 2, b, 3, a.length-4);
		
		for (byte c : b) {
			System.out.print(c+"\t");
		}
	}

}	
