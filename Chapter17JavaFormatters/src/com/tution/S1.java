package com.tution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class S1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please specify your language en/de/fr/it");
		
		String lang=br.readLine();
		Locale l=new Locale(lang);
		
		ResourceBundle rb= ResourceBundle.getBundle("M1",l);
		System.out.println(rb.getString("m"));
		
		double num=Double.parseDouble(br.readLine());
		double result=num*num;
		
		System.out.println(result);
		br.close();
	}

}
