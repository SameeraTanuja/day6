package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Students;

class CollectionStudent {

	@Test
	void testCollection() {
		ArrayList<Students> stud=new ArrayList<Students>();
		assertEquals(true, stud.add(new Students("Sameera",93,"CSE")));
		assertEquals(true, stud.add(new Students("Santosh",99,"Mech")));
		assertEquals(true, stud.add(new Students("barbie",85,"ECE")));
		assertEquals(true,stud.add(new Students("Aishu",67,"IT")));
		assertEquals(true,stud.add(new Students("Nani",45,"CSE")));
		assertEquals(true, stud.add(new Students("Santosh",99,"Mech")));
		assertEquals(true, stud.add(new Students("Santosh",99,"Mech")));
		assertEquals(true,stud.add(new Students("Manju",87,"CSE")));
		
		System.out.println(stud);
		
		
		//fail("Not yet implemented");
	}

}
