package com.test;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, j=10;
		do{
			if(i>j)
				break;
			j--;
		}while(++i<5);
		System.out.println("i= "+i+" and j= "+j);
	}

}
