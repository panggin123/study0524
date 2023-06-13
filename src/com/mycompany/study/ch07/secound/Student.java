package com.mycompany.study.ch07.secound;

public class Student extends People{

	public int studentNo;
	
	public Student(String name, String ssn, String color, int sum, int studentNo) {
		super(name, ssn, sum, color);
		
		this.name = name;
		this.ssn = ssn;
		this.color = color;
		this.sum = sum;
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn, String color, int sum) {
		super(name, ssn, sum, color);
	}
	
	public Student() {
//		super();
	}
}
