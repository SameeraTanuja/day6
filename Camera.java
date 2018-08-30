package com.capgemini.day6;

public class Camera {
	
		private String model;
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public Camera(String model, double price, String brand) {
			super();
			this.model = model;
			this.price = price;
			this.brand = brand;
		}
		public Camera() {
			super();
			// TODO Auto-generated constructor stub
		}
		private double price;
		private String brand;

	}


