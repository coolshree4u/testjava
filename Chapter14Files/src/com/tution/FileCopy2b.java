package com.tution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy2b {

	public static void main(String args[]) throws IOException{
		Path src=Paths.get("scjp.txt");
		Path dest=Paths.get("scjp7a.txt");
		
		byte b[]=Files.readAllBytes(src);
		Files.write(dest, b);
	}
}
