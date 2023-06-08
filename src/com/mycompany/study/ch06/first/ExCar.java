package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		System.out.println(a);
		
		Car car = new Car();	// 생성
		
		// 이하 사용
		System.out.println("car.engine"+ " " + car.engine);
		System.out.println("car.name"+ " " + car.name);
		System.out.println("car.color" + " " + car.color);
		System.out.println("car.company"+ " " + car.company);
		
		car.go();
		car.back();
		
		
		Ipod ipod = new Ipod();
		
		System.out.println(ipod.season);
		System.out.println(ipod.size);
		System.out.println(ipod.name);
		System.out.println(ipod.color);
		
		ipod.buttonUp();
		ipod.buttonDown();
	}

}
