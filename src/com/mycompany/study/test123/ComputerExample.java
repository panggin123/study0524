package com.mycompany.study.test123;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int r =7;
//		
//		Calculator calculator = new Calculator();
//		Computer computer = new Computer();
//		
//
//		System.out.println("원의 반지름:" + r);
//		System.out.println("Calculator 객체의 원면적 구하는 프로그램:" + r);
//		System.out.println("원의 면적:" + 	calculator.cirelArea(r));
//		System.out.println("Computer 객체의 원면적 구하는 프로그램:" + r);
//		System.out.println("원의 면적:" + 	computer.cirelArea(r));
		
		int r = 7;
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.println("원의 반지름"+r);
		System.out.println("원의 면적"+r);
		System.out.println("원의 면적"+ calculator.cirelArea(r));
		System.out.println("원의 반지름"+r);
		System.out.println("원의 반지름"+ computer.cirelArea(r));
	}

}
