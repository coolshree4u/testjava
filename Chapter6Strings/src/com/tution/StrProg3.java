package com.tution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrProg3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str1, str2, str3,str4;
		
		boolean result;
		
		System.out.println("Enter the First String");
		str1=br.readLine();
		
		System.out.println("Enter the Second String");
		str2=br.readLine();
		
		result=str1.equalsIgnoreCase(str2);
		
		if(result){
			str3=str1.concat(str2);
			str4=str3.toLowerCase();
			System.out.println("Concatenated String "+str4);
		}
		else
		{
			System.out.println("Strings are not same");
		}
	}

}
