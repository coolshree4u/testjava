package com.tution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferCopier {

	public static void main(String[] args) throws IOException {
		File inputFile=new File("scjp.txt");
		File outputFile=new File("scjpcopy.txt");
		
		FileReader in=new FileReader(inputFile);
		FileWriter out=new FileWriter(outputFile);
		
		BufferedReader read=new BufferedReader(in);
		BufferedWriter write=new BufferedWriter(out);
		
		String line;
		while((line=read.readLine())!= null){
			write.write(line);
			write.newLine();
		}
		
		read.close();
		write.close();
		out.close();
		in.close();
	}

}
