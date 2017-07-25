package com.tution;

public class Ret1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
		int ans=mini(n1,n2);
		System.out.println("Minimum number is "+ans);
	}

	private static int mini(int n1, int n2) {
		// TODO Auto-generated method stub
		if(n1<n2)
			return n1;
		else
			return n2;
	}
}
