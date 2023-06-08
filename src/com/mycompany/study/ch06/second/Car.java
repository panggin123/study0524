package com.mycompany.study.ch06.second;

public class Car {

	//field
//	int engine = 4;
//	String name = "소나타";
//	String color = "화이트";
//	String company = "현대자동차";
	
	int engine;
	String name;
	String color;
	String company;
	
	
	//기본생성자
	Car(){
		
	}
	
	Car(String color){
		this.color = color;
	}
	
	Car(int engine, String name, String color, String company){
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company;
	}
	
	
	//method  함수의 기능 
	void go(){
		System.out.println("앞으로 갑니다.");
	}
	
	void back() {
		System.out.println("뒤로 갑니다.");
	}
	
}

