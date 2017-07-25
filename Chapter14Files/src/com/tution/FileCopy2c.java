package com.tution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileCopy2c {

	public static void main(String[] args) throws IOException {
		Path src=Paths.get("scjp.txt");
		Path dest3=Paths.get("scjp8a.txt");
		Path dest4=Paths.get("scjp8b.txt");

		
		List<String> st1=Files.readAllLines(src);
		Files.write(dest3, st1, StandardOpenOption.APPEND);
		
		Stream<String> st=Files.lines(src);
		List<String> data=st.map(String::toLowerCase).collect(Collectors.toList());
		Files.write(dest4, data);
		
		
	}

}
