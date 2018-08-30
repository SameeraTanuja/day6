package com.capgemini.day6;

import java.util.ArrayList;
import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String school;
	private String district;
	private int greatSchoolRanking;
	
	@Override
	public int hashCode() {
		return Objects.hash(name,city,greatSchoolRanking);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		School s1 = (School) obj;
		return this.name == s1.name && this.city == s1.city && this.greatSchoolRanking == s1.greatSchoolRanking;
	}
	
	
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}




	public School(String name, String city, String school, String district, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.school = school;
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
	}




	public static void printAll(ArrayList<School> school2) {
		for (School school : school2) {
			
		
		System.out.println("Name: "+school.name);
		System.out.println("City: "+school.city);
		System.out.println("School: "+school.school);
		System.out.println("District: "+school.district);
		System.out.println("GreatSchoolRanking: "+school.greatSchoolRanking);
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
}
