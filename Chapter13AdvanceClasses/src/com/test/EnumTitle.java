package com.test;

public class EnumTitle {
	public enum Title {
		MR("Mr."), MRS("Mrs."), MS("Ms.");
		private final String title;

		private Title(String t) {
			title = t;
		}

		public String format(String last, String first) {
			return title + "" + last + "" + first;
		}

	}

	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println(Title.MR.format("Doe", "john"));
	}
}
