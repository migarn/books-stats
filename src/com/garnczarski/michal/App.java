package com.garnczarski.michal;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		showStats("books.txt");
	}

	public static void showStats(String pathToFile) {
		Parser parser = new Parser();
		Stats stats = new Stats();
		List<Book> booklist;

		try {
			booklist = parser.parse(pathToFile);
			stats.countBooksPerCategory(booklist);
			stats.topAuthors(booklist);
			String readCategory = readCategory(booklist);
			stats.topAuthorsInCategory(booklist, readCategory);
		} catch (Exception e) {
			System.out.println("File not found.");
		}
	}

	public static String readCategory(List<Book> booklist) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nType category for printing its top authors:");
			String category = scanner.nextLine();
			for (Book book : booklist) {
				if (book.getCategory().equals(category)) {
					return category;
				}
			}
			System.out.println("\nCategory not found.");
		}
	}
}
