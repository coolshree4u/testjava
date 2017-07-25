package com.tution;

public class Max3 {

	public static void main(String[] args) {

		int a,b,c,max;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		
		if(a>b)
			max=a;
		else
			max=b;
		if(max<c)
			max=c;
		
		System.out.println("Max is "+ max);
		
	}

}
