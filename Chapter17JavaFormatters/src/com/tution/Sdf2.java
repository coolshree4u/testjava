package com.tution;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sdf2 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today is " + today);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf1.format(today));

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf2.format(today));

		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy:HH:mm:SS");
		System.out.println(sdf3.format(today));

		SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy:HH:mm:SS Z");
		System.out.println(sdf4.format(today));
	}

}
