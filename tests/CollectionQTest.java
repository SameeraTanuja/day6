package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class CollectionQTest {

	
		@Test
		void testStudentFavouriteFruit() {
			HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
			String[] favorites = new String[] {"fasgh","asdyau"};
			map.put("Sameera", new ArrayList<>(Arrays.asList(favorites)));
			favorites = new String[] {"banana","kiwi","orange"};
			map.put("Santosh", new ArrayList<>(Arrays.asList(favorites)));
			favorites = new String[] {"peru","cockroach"};
			map.put("Aishu", new ArrayList<>(Arrays.asList(favorites)));
			favorites = new String[] {"peru","papaya","apple"};
			map.put("Manju", new ArrayList<>(Arrays.asList(favorites)));
			
			assertEquals(4, map.size());
			for (Map.Entry<String,ArrayList<String>> entry : map.entrySet()) 
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
			
		}
	
}

		
		//fail("Not yet implemented");
	


