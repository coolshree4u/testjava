package com.tution;

public class Array2Dh {

	public static void main(String[] args) {

		int a[][]={{10,20,30},
				{40,50,60,70},
				{80,90,100,110}};
		
		sum(a);
	}
	
	public static void sum(int[][] arr)
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				total=total+arr[i][j];
			}
		}
		System.out.println("Sum of array elements = "+total);
	}
}