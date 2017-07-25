package com.test;

import java.io.File;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File("dir");
		dir.mkdir();
		File f1=new File(dir,"f1.txt");
		
		try {
			f1.createNewFile();
			System.out.println("Created....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
