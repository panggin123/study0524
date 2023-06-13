package com.mycompany.study.ch07.third;

public abstract class Phone {

	
	// abstract 추상 클래스 객체 생성 불가능
	// ccnc
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("turnOn");
	}
	public void turnOff() {
		System.out.println("turnOff");
	}
	public abstract void open();
}
