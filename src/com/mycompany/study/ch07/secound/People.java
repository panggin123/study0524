package com.mycompany.study.ch07.secound;

public class People {

	public String name;
	public String ssn;
	public int sum;
	public String color;
	
	
	// 부모에 생성자가 존재한다. 
	public People(String name, String ssn, int sum, String color) {
		this.name = name;
		this.ssn = ssn;
		this.color = color;
		this.sum = sum;
		
	}

	public People() {
	}
}
