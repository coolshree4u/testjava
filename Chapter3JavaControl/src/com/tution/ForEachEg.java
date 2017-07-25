package com.tution;

public class ForEachEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,5,7,9};
		System.out.println("Elements are");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		for(int j:arr)
		{
			System.out.print(j+" ");
		}
	}

}
