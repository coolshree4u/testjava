package com.tution;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharCopier {

	public static void main(String[] args) throws IOException {
		File inputFile=new File("scjp.txt");
		File outputFile=new File("scjpcopy.txt");
		
		FileReader in=new FileReader(inputFile);
		FileWriter out=new FileWriter(outputFile);
		
		int c;
		while((c=in.read())!= -1)
			out.write(c);
		
		
		in.close();
		out.close();
	}
}
//Source File in this case "scjp.txt" must be exist
