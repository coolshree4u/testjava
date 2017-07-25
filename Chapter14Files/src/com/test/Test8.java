package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test8 {

	public static void readByCharFile(String resource) {

		char[] c = new char[1024];
		try (FileReader fr = new FileReader(resource)) {
			int count = 0;
			int read = 0;
			while ((read = fr.read(c)) != -1) {
				count += read;
			}
			System.out.println("Read : " + count + " Characters");
		} catch (IOException io) {
			System.out.println(io);
		}
	}

	public static void readByLineFile(String resource) {
		try (FileReader fr = new FileReader(resource); BufferedReader br=new BufferedReader(fr);) {
			int count = 0;
			while ((br.readLine()) != null) {
				count++;
			}
			System.out.println("Read : " + count + " Lines");
		} catch (IOException io) {
			System.out.println(io);
		}
	}

	public static void main(String[] args) {
		readByCharFile("scjp7.txt");
		readByLineFile("scjp7.txt");
	}

}
