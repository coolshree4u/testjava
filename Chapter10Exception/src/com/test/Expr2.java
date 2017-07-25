package com.test;

import java.io.IOException;
import java.sql.SQLException;

public class Expr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expr2 e1 = new Expr2();
		try {
			e1.b1();
			e1.b2();
			System.out.println("a");
		} catch (SQLException ise) {
			System.out.println("Inside SQL and IO Exception");
			System.out.println("b");
		} catch (IOException e) {
			System.out.println("Inside IOException");
		} catch (Exception e) {
			System.out.println("c");
		} finally {
			System.out.println("c");
		}
	}

	public void b1() throws SQLException {
		throw new SQLException();
	}

	public void b2() throws IOException {
		throw new IOException();
	}
}
