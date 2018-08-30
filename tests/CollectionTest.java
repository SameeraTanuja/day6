package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Telivision;
import com.capgemini.day6.Car1;


class CollectionTest {

	@Test
	void CarTest() {
		ArrayList<Car1> car=new ArrayList<Car1>();
		assertEquals(true, car.add(new Car1("tata","nano",2005,300000)));
		assertEquals(true, car.add(new Car1("bmw","x5",2006,1000000)));
		assertEquals(true, car.add(new Car1("hyundai","santro",2009,700000)));
		System.out.println(car);
		
		
		
		//fail("Not yet implemented");
	}
	
	/*@Test
	void CellPhoneTest() {
		ArrayList<CellPhone> cell=new ArrayList<CellPhone>();
		assertEquals(true, cell.add(new CellPhone("samsung","j7max","best","Android",17000)));
		assertEquals(true, cell.add(new CellPhone("oneplus","6","good","Android",50000)));
		assertEquals(true, cell.add(new CellPhone("apple","i6","good","IOS",30000)));
		CellPhone.printAll(cell);
	
	

}
	@Test
	void SchoolTest() {
		ArrayList<School> school=new ArrayList<School>();
		assertEquals(true, school.add(new School("sam","Hyderabad","JGS","Rangareddy",1)));
		assertEquals(true, school.add(new School("Geetha","Bangalore","GMS","bg",5)));
		assertEquals(true, school.add(new School("NMS","Hyderabad","NMS","Hyderabad", 3)));
		School.printAll(school);
	
}
   
	@Test
	void LaptopTest() {
		ArrayList<Laptop> laptop=new ArrayList<Laptop>();
		assertEquals(true, laptop.add(new Laptop("asus","N70UF","Windows","Intelcore7")));
		assertEquals(true, laptop.add(new Laptop("dell","B60UH","Windows8","Intelcore3")));
		assertEquals(true, laptop.add(new Laptop("lenovo","C09UF","Windows10","Intelcore5")));
		Laptop.printAll(laptop);

}
	
	@Test
	void TelevisionTest(){
		ArrayList<Telivision> tv=new ArrayList<Telivision>();
		assertEquals(true, tv.add(new Telivision("LG","LED",true,30000)));
		assertEquals(true, tv.add(new Telivision("Sony","LCD",false,54000)));
		assertEquals(true, tv.add(new Telivision("Onida","Plasma",true,35000)));
		Telivision.printAll(tv);
	}*/
		
	}

