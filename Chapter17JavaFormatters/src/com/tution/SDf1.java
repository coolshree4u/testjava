package com.tution;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SDf1 {

	public static void main(String[] args) {
		Date today=new Date();
		System.out.println("Today is "+today);

		SimpleDateFormat sdf1=new SimpleDateFormat("d");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd");
		System.out.println(sdf2.format(today));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("ddd");
		System.out.println(sdf3.format(today));
		
		SimpleDateFormat sdf4=new SimpleDateFormat("dddd");
		System.out.println(sdf4.format(today));
		
		System.out.println("*****************************************************");
		
		SimpleDateFormat sdf5=new SimpleDateFormat("m");
		System.out.println(sdf5.format(today));
		
		SimpleDateFormat sdf6=new SimpleDateFormat("mm");
		System.out.println(sdf6.format(today));
		
		SimpleDateFormat sdf7=new SimpleDateFormat("mmm");
		System.out.println(sdf7.format(today));
		
		SimpleDateFormat sdf8=new SimpleDateFormat("mmmm");
		System.out.println(sdf8.format(today));
		
		System.out.println("*****************************************************");
		
		SimpleDateFormat sdf9=new SimpleDateFormat("y");
		System.out.println(sdf9.format(today));
		
		SimpleDateFormat sdf10=new SimpleDateFormat("yy");
		System.out.println(sdf10.format(today));
		
		SimpleDateFormat sdf11=new SimpleDateFormat("yyy");
		System.out.println(sdf11.format(today));
		
		SimpleDateFormat sdf12=new SimpleDateFormat("yyyy");
		System.out.println(sdf12.format(today));
		
	}

}
