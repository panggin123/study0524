package com.mycompany.study.ch06.third;

public class ExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
//		Arithmetic arithmetic = new Arithmetic();
//				
//		int result = arithmetic.add(1,1);
//
//		System.out.println("result:"+result);
	
	
	Arithmetic arithmetic = new Arithmetic();
	
	
	int result = arithmetic.add(1, 1);
	System.out.println("result" + result);

	String result2 = arithmetic.name("장원영");
	System.out.println("result2:"+ result2);
	
	arithmetic.group("블랙핑크");
					// 
	
	int result3 = arithmetic.taken();
	System.out.println("result3:"+result3);
	}

	
}
