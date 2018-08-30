package com.capgemini.day6;

public class Car1 implements Comparable<Car1>{
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car1(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String toString()
	{
		return "model=" + model + ", price=" + price + ", make=" + make + ", year=" + year +"\n";
	}
	
	@Override
	public int compareTo(Car1 car) {
		return this.make.compareTo(car.make);
	}

}
