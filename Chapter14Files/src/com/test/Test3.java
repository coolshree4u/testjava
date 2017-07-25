package com.test;

import java.io.File;

public class Test3 {

	public static void main(String[] args) {
		try {
			File file=new File("test.txt");
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
