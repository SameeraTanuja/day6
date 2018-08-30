package com.capgemini.day6;

public class Students {
	private String name;
	private int rollNo;
	private String branch;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String name, int rollno, String branch) {
		// TODO Auto-generated constructor stub
	
	
		
		this.name = name;
		this.rollNo = rollNo;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void getBranch(String branch) {
		this.branch = branch;
	}
	public String setBranch(String branch) {
		return branch;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ",branch=" + branch + "]";
	}
	 
	
}


