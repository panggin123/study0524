package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		System.out.println(a);
		
		Car car = new Car();	// 생성 (기본 생성자)
		
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
		
		
		
		//Car car = new Car();
		
		System.out.println(car.engine1);
		System.out.println(car.name1);
		System.out.println(car.color1);
		System.out.println(car.company1);
		
		car.down();
		car.up();
		
		System.out.println(ipod.name2);
		System.out.println(ipod.color2);
		System.out.println(ipod.season2);
		System.out.println(ipod.home2);
		
		ipod.red();
		ipod.yellow();
	}

}
