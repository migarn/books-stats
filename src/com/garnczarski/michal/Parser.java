package com.garnczarski.michal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Parser {

	public List<Book> parse(String pathToFile) throws IOException {

		File in = new File(pathToFile);

		String line = "";
		BufferedReader inReader;
		
		try {
			inReader = new BufferedReader(new FileReader(in));

			while ((line = inReader.readLine()) != null) {
				// TODO
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			inReader.close();
		}

		return null;
	}

}
