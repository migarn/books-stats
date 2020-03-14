package com.garnczarski.michal;

import java.io.FileNotFoundException;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		Parser parser = new Parser();
		List<Book> booklist;

		
		try {
			booklist = parser.parse("books.txt");
			for (Book book : booklist) {
				System.out.println(book.getAuthor());
			}
		}
		catch (Exception e) {
			System.out.println("File not found.");
		}	
	}

}