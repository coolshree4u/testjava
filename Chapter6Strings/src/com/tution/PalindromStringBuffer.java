package com.tution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromStringBuffer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the string for palindrom");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		if(str.equals(sb.toString()))
			System.out.println("***********************Palindrom String***********************");
		else
			System.out.println("***********************Not Palindrom String***********************");
	}
}