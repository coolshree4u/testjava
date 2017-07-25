package com.test;

import java.io.IOException;
import java.sql.SQLException;

public class Expr1 {

	public static void main(String[] args) {
		Expr1 e1=new Expr1();
		try{
			e1.b1();
			System.out.println("a");
		}catch (IOException | SQLException ise) {
			System.out.println("Inside SQL and IO Exception");
			System.out.println("b");
		}
		finally {
			System.out.println("c");
		}
	}

	public void b1() throws IOException,SQLException
	{
		throw new SQLException();
	}
}
