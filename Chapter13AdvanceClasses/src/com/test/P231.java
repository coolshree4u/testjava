package com.test;

import java.util.stream.DoubleStream;

public class P231 {

	public static void main(String[] args) {
		DoubleStream d=DoubleStream.of(1.2,2.4,3.5,2.9);
        double c=d.filter(x-> x>2).count();
        System.out.println(c);
	}

}
