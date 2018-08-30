package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;



import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Telivision;




class DuplicateTest {

	/*@Test
	void CarTest() {
		HashSet<Car> car=new HashSet<Car>();
		assertEquals(true, car.add(new Car("tata","nano",2005,300000)));
		assertEquals(true, car.add(new Car("bmw","x5",2006,1000000)));
		assertEquals(true, car.add(new Car("hyundai","santro",2009,700000)));
		assertEquals(false, car.add(new Car("bmw","x5",2006,1000000)));
		
		System.out.println(car);
		
		
		
		//fail("Not yet implemented");
	}*/
	
	/*@Test
	void CellPhoneTest() {
		HashSet<CellPhone> cell=new HashSet<CellPhone>();
		assertEquals(true, cell.add(new CellPhone("samsung","j7max","best","Android",17000)));
		assertEquals(true, cell.add(new CellPhone("oneplus","6","good","Android",50000)));
		assertEquals(true, cell.add(new CellPhone("apple","i6","good","IOS",30000)));
		assertEquals(false,cell.add(new CellPhone("apple","i6","good","IOS",30000)));
		System.out.println(cell);
	
	

}*/
	@Test
	void SchoolTest() {
		HashSet<School> school=new HashSet<School>();
		assertEquals(true, school.add(new School("sam","Hyderabad","JGS","Rangareddy",1)));
		assertEquals(true, school.add(new School("Geetha","Bangalore","GMS","bg",5)));
		assertEquals(true, school.add(new School("NMS","Hyderabad","NMS","Hyderabad", 3)));
		assertEquals(false, school.add(new School("sam","Hyderabad","JGS","Rangareddy",1)));
		System.out.println(school);
	
}
   
	/*@Test
	void LaptopTest() {
		HashSet<Laptop> laptop=new HashSet<Laptop>();
		assertEquals(true, laptop.add(new Laptop("asus","N70UF","Windows","Intelcore7")));
		assertEquals(true, laptop.add(new Laptop("dell","B60UH","Windows8","Intelcore3")));
		assertEquals(true, laptop.add(new Laptop("lenovo","C09UF","Windows10","Intelcore5")));
		assertEquals(false, laptop.add(new Laptop("asus","N70UF","Windows","Intelcore7")));
		System.out.println(laptop);

}*/
	
	/*@Test
	void TelevisionTest(){
		HashSet<Telivision> tv=new HashSet<Telivision>();
		assertEquals(true, tv.add(new Telivision("LG","LED",true,30000)));
		assertEquals(true, tv.add(new Telivision("Sony","LCD",false,54000)));
		assertEquals(true, tv.add(new Telivision("Onida","Plasma",true,35000)));
		assertEquals(false, tv.add(new Telivision("LG","LED",true,30000)));
		System.out.println(tv);
	}*/
		
	}




	
		

			
	
			
		