package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student;


class StudentCollection {

	@Test
	void testStudent() {
		
			ArrayList<Student> stud=new ArrayList<Student>();
			assertEquals(true, stud.add(new Student("Sameera",93,"CSE")));
			assertEquals(true, stud.add(new Student("Santosh",99,"Mech")));
			assertEquals(true, stud.add(new Student("barbie",85,"ECE")));
			assertEquals(true,stud.add(new Student("Aishu",67,"IT")));
			assertEquals(true,stud.add(new Student("Nani",45,"CSE")));
			assertEquals(true, stud.add(new Student("Santosh",99,"Mech")));
			assertEquals(true, stud.add(new Student("Santosh",99,"Mech")));
			assertEquals(true,stud.add(new Student("Manju",87,"CSE")));
			
			System.out.println(stud);
			Collections.sort(stud);  
			for(Student st:stud){  
			System.out.println(st.getName()+" "+st.getRollno()+" "+st.getBranch());
		}
		//fail("Not yet implemented");
	}
}


