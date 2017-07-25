package com.test;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test11 {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("myFile.txt"))){
			String line="";
			int count=1;
			br.mark(1);
			line=br.readLine();
			System.out.println(count+":"+line);
			line=br.readLine();
			count++;
			System.out.println(count+":"+line);
			br.reset();
			line=br.readLine();
			count++;
			System.out.println(count+":"+line);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
