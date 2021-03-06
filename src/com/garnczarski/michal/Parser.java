package com.garnczarski.michal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

	public List<Book> parse(String pathToFile) throws IOException {
		List<Book> bookList = new ArrayList<>();
		File in = new File(pathToFile);

		String line = "";
		BufferedReader inReader = null;

		try {
			inReader = new BufferedReader(new FileReader(in));

			int counter = 1;
			String author = "";
			String title = "";
			String category = "";

			while ((line = inReader.readLine()) != null) {
				if (line.trim().equals("")) {
					if (counter == 2 || counter == 3) {
						System.out.println("Incomplete record ommited.");
					}
					counter = 0;
				}
				if (counter == 1) {
					author = line;
				} else if (counter == 2) {
					title = line;
				} else if (counter == 3) {
					category = line;
					bookList.add(new Book(author, title, category));
				}
				counter++;
				if (counter == 4) {
					counter = 1;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inReader.close();
		}
		return bookList;
	}
}
