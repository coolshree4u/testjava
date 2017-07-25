package com.test;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		String team="rouble, nidhi, shashank, krishna, pradeep";
		Scanner scan =new Scanner(team);
		scan.useDelimiter(",\\s");
		
		while(scan.hasNext()){
			System.out.println(scan.next()+" ");
		}
	}

}
