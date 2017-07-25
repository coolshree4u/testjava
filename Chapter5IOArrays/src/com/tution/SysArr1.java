package com.tution;

public class SysArr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={0,1,2,3,4,5};
		int arr2[]={0,10,20,30,40,50};
		
		System.arraycopy(arr1, 2, arr2, 1, 3);
		for(int a:arr1)
			System.out.print(a+ " ");
		
		System.out.println();
		
		for(int b:arr2)
			System.out.print(b+ " ");

	}

}
