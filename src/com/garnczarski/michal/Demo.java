package com.garnczarski.michal;

import java.io.FileNotFoundException;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		Parser parser = new Parser();

		
		try {
			parser.parse("books.txt");
		}
		catch (Exception e) {
			System.out.println("File not found.");
		}
		

	}

}
