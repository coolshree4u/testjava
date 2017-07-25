package com.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Kessey {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("bigData.txt");
		FileWriter fileWriter=new FileWriter(file);
		
		//fileWriter.println("Lots of data present");
		//No such method present
		fileWriter.write("Lots of data present");
		fileWriter.append("Data is appended");
		fileWriter.flush();
		fileWriter.close();
		System.out.println("Data written successfully");
	}

}
