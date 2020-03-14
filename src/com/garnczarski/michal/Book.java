package com.garnczarski.michal;

public class Book {
	private String author;
	private String title;
	private String category;
	
	public Book(String author, String title, String category) {
		this.author = author;
		this.title = title;
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}
	
	
}
