package com.tution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
			System.out.println("Enter no.");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine());
			System.out.println("Entered No. is "+n);
		}catch (NumberFormatException e) {
			System.out.println("Wrong Data entered");
			System.out.println("Programe execution ended");
		}
		
	}
}