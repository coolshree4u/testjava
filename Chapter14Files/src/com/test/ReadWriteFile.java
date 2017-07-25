package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile {

	public static void main(String[] args) {
		String filename="myFile.txt";
		String newFile="newFile.txt";
		try(BufferedReader br=new BufferedReader(new FileReader(filename)); BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(newFile))){
			String line;
			int count=1;
			line=br.readLine();
			while(line!=null){
				bufferedWriter.write(count+":"+line);
				line=br.readLine();
				System.out.println(line);
				count++;
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
