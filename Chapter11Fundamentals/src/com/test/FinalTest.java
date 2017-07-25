package com.test;


public class FinalTest {
    public static void main(String[] args) {
      House h=new House();
      h.address="123 main street";
      h=null;
      System.gc();
    }
}
