package com.test;

public class Test15 {

    public static void main(String[] args) {
        Integer one = new Integer(12);
        Integer two = new Integer(12);
        if (one == two) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int three = 12;
        if (one == three) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
