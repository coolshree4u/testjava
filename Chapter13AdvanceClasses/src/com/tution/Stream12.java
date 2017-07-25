package com.tution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream12 {

	public static void main(String[] args) {

		int arr[] = { 30, 50, 40, 20, 70, 10, 20, 50 };
		IntStream s1 = Arrays.stream(arr);
		s1.forEach(n -> System.out.print(n + ""));
		// eg2
		IntStream s2 = Arrays.stream(arr);
		int ma= s2.max().getAsInt();
		System.out.println(ma);
		
		IntStream s3 = Arrays.stream(arr);
		int mi= s3.min().getAsInt();
		System.out.println(mi);
		
		
		IntStream s4 = Arrays.stream(arr);
		double av= s4.average().getAsDouble();
		System.out.println(av);
	}

}
