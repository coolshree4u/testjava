package com.tution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrProg1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str1, str2, str3;
		int len1, len2;
		
		System.out.println("Enter the first String");
		str1=br.readLine();
		System.out.println("Enter Second String");
		str2=br.readLine();
		
		len1=str1.length();
		len2=str2.length();
		System.out.println("First String : "+str1+" length is "+len1);
		System.out.println("Second String : "+str2+" length is "+len2);
		
		str3=str1.concat(str2);
		System.out.println("Concatenated String : "+str3);
	}

}
