package com.capgemini.day6;
import java.util.HashSet;

public class CameraClient {
	public static void main(String args[])
	{
		HashSet<Camera>products=new HashSet<>();
		products.add(new Camera("NK234",3500,"NIKON"));
		products.add(new Camera("CN221",2500,"CANNON"));
		products.add(new Camera("NK234",3500,"NIKON"));
		for(Camera c:products) {
			System.out.println(c);
		}
		
	}
	
	

}
