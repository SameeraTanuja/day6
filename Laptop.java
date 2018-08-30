package com.capgemini.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop {
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	@Override
	public int hashCode() {
		return Objects.hash(company,model,processor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Laptop l1 = (Laptop) obj;
		return this.company == l1.company && this.model == l1.model && this.processor == l1.processor;
	}
		
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	public static void printAll(ArrayList<Laptop> laptop) {
		for (Laptop laptop2 : laptop) {
			System.out.println("Company: "+laptop2.company);
			System.out.println("model: "+laptop2.model);
			System.out.println("operatingSystem: "+laptop2.operatingSystem);
			System.out.println("processor: "+laptop2.processor);
		}
	

	}
}
