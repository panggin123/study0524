package com.mycompany.study.ch06.third;

public class Arithmetic {

	// 더하기 함수 (피연사자는 2개로 한정) 선언
	// y = a + b
	
	public int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int minus(int a, int b) {
		int y = a - b;
		return y;
	}
	
	public int multi(int a, int b) {
		int y = a * b;
		return y;
	}
	
	
	public String name(String name) {
		String result;
		
		if(name.equals("장원영")) {
			result = "Tony";
		}else {
			result = "몰라";
		}
		return result;
		
	}	
					  // 매개변수
	public void group(String name) {
		switch(name) {
		case "아이브":
			System.out.println("장원영은 너무 이뻐");
			break;
			default:
				System.out.println("다른 사람은 그냥 이뻐");
				break;
		}
	}	
		
	public int taken() {
		
		return 10000;
	}
	}
		

	
	

	
	

