package com.tution;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F1a {

	public static void main(String[] args) {
		Path p = Paths.get(args[0]);
		System.out.println(Files.exists(p));
	}

}
