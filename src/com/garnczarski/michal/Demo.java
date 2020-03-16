package com.garnczarski.michal;

import java.io.FileNotFoundException;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		Parser parser = new Parser();
		Stats stats = new Stats();
		List<Book> booklist;

		
		try {
			booklist = parser.parse("books.txt");
			stats.countBooksPerCategory(booklist);
			stats.topAuthors(booklist);
			
//			for (Book book : booklist) {
//				System.out.println(book.getAuthor() + " " + book.getTitle() + " " + book.getCategory());
//				System.out.println();
//			}
		}
		catch (Exception e) {
			System.out.println("File not found.");
		}	
	}

}
