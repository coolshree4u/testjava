package com.tution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy2a {

	public static void main(String[] args) throws IOException {
		Path src=Paths.get("scjp.txt");
		Path dest=Paths.get("scjp7.txt");
		
		Files.copy(src, dest,StandardCopyOption.REPLACE_EXISTING);
	}

}
