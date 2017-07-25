package com.test;

public class TestEdition {

	public static void main(String[] args) {
		String edition[] = { "SE", "ee", "ME" };
		for (String edit : edition) {
			try {
				switch (edit) {
				case "SE":
					System.out.println("Standard Edition");
					break;
				case "EE":
					System.out.println("Enterprise Edition");
					break;
				default:
					assert false;
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getClass());
			}
		}
	}

}
