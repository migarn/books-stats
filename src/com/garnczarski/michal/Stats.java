package com.garnczarski.michal;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stats {

	public void countBooksPerCategory(List<Book> books) {
		
		Map<String, Integer> categoriesMap = new HashMap<>();
		
        for (Book book : books) {
        	String category = book.getCategory();
        	
        	if (categoriesMap.containsKey(category)) {
        		categoriesMap.put(category, categoriesMap.get(category) + 1);
        	}
        	else {
        		categoriesMap.put(category, 1);
        	}
        }
        
        System.out.println("\nBooks categories:");
        
        categoriesMap.entrySet().stream()
        	       .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        	       .forEach(k -> System.out.println("\t" + k.getKey() + ": " + k.getValue()));     
    }

}
