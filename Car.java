package com.capgemini.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
	private String make;
	private String model;
	private long year;
	private double price;
	
	@Override
	public int hashCode() {
		return Objects.hash(make,model,price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Car c1 = (Car) obj;
		return this.make == c1.make && this.model == c1.model && this.price == c1.price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Car(String make, String model, long year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}



	public static void printAll(ArrayList<Car> car) {
		for (Car car2 : car) {
			System.out.println("Make: "+car2.make);
			System.out.println("Model: "+car2.model);
			System.out.println("Year: "+car2.year);
			System.out.println("Price: "+car2.price);
			
		}
		// TODO Auto-generated method stub
		
	}
	
	
	

}
