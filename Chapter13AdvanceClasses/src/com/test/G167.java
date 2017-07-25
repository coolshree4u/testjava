package com.test;

import java.util.stream.Stream;

public class G167 {

	public static void main(String[] args) {
		long count=Stream.of(1,2,3,4,5).map(i->i*i).count();
        System.out.println(count);
	}

}
