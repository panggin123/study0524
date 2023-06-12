package com.mycompany.study.ch06.first;

public class Car {

	//field
	int engine = 4;
	String name = "소나타";
	String color = "화이트";
	String company = "현대자동차";
	
	//method  함수의 기능 
	void go(){
		System.out.println("앞으로 갑니다.");
	}
	
	void back() {
		System.out.println("뒤로 갑니다.");
	}
	
	
	int engine1 = 4;
	String name1 = "벤츠";
	String color1 = "빨강";
	String company1 = "벤츠";
	
	void down() {
		System.out.println("아래");
	}
	void up() {
		System.out.println("위");
	}
	
}
