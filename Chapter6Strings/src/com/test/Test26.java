package com.test;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		String s="Baba Baba black sheep have you any wool";
		
		Scanner scan=new Scanner(s);
		while(scan.hasNext()){
			System.out.println(scan.next()+" ");
			scan.close();
		}
	}
}
