package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile1 {

	public static void main(String[] args) {
		String filename="myFile.txt";
		try(BufferedReader br=new BufferedReader(new FileReader(filename))){
			String line;
			int count;
			line=br.readLine();
			do{
				line=br.readLine();
				System.out.println(line);
			}while(line!=null);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
