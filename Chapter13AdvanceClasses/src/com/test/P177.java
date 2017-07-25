package com.test;
import java.util.stream.*;

public class P177 {

    public static void main(String[] args) {
        int a = IntStream.of(10, 30, 20, 40).sum();
        System.out.println(a);
    }

}
