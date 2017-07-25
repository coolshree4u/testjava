package com.tution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferCopier1b {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("scjp.txt");
		File outputFile = new File("scjpcopy.txt");

		try (FileReader in = new FileReader(inputFile);
				FileWriter out = new FileWriter(outputFile, true);

				BufferedReader read = new BufferedReader(in);
				BufferedWriter write = new BufferedWriter(out);) {

			String line;
			while ((line = read.readLine()) != null) {
				// If FileWriter Constructor is set to true
				// Then .write(string) method will append
				write.write(line);
				write.newLine();
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
