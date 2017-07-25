package com.ch11;

public class Book {
	int id;
	String name;

	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object obj){
		boolean output=false;
		Book b=(Book)obj;
		if (this.name.equals(b.name)){
			output=true;
		}
		return output;
	}
	
	public static void main(String args[]){
		Book book1=new Book(101, "Java Programming");
		Book book2=new Book(102, "Java Programming");
		
		System.out.println(book1.equals(book2));
	}
}
