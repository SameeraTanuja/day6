package com.capgemini.day6;


	 public class Student implements Comparable<Student>{  
		 public String name;
		 public int rollno;
		 public String branch;
		 public Student(String name,int rollno, String branch){  
			 
			 this.setName(name); 
			 this.setRollno(rollno);
			 this.setBranch(branch);  
			 }  
		 public int compareTo(Student st){  
			 if(getRollno()==st.getRollno())  
			 return 0;  
			 else if(getRollno()>st.getRollno())  
			 return 1;  
			 else  
			 return -1;  
			 
		 
	 
		 
		  
		 
	 }
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
	 
	 }
		

