package com.tution;

public class Array1Dh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,20,30};
		sum(a);
		
	}
	static void sum(int []arr)
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total=total+arr[i];
		}
		System.out.println("Sum of array elements = "+total);
	}
}