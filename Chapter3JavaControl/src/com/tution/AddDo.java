package com.tution;

public class AddDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		
		do {
			sum=sum+i;
			i++;
		}while (i<6);
		System.out.println("The sum of the first five numbers is : "+sum);
	}

}
