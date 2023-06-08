package com.mycompany.study.ch06.trfirst;

public class Car {

	int engine;
	String name;
	String color;
	String company;
	
	//기본 생성자
	Car(){
		
	}
	
	Car(String color){
		this.color = color;
	}
	
	Car(int engine,String name,String color,String company){
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company; 
	}
	// 메서드
	void go() {
		System.out.println("앞으로 가다");
	}
	void back() {
		System.out.println("뒤로 가다");
	}
}
