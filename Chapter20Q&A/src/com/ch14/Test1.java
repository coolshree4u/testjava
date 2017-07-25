package com.ch14;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		try {
			File file = new File("/tmp");
			if (!file.exists())
				file.mkdir();

			File newFile = new File("/tmp/abhi.txt");
			newFile.createNewFile();

			System.out.println("End with program");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}