package com.mycompany.study.ch04;

public class ExSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		int num = 2;
//		
//		switch (num) {
//		case 1: 
//			System.out.println("1번이 나왔습니다.");
//			break;	
//		case 2: 
//			System.out.println("2번이 나왔습니다.");
//			break;
//		
//		default:
//			System.out.println("1번도 2번도 아닌 것이 나왔습니다.");
//			break;
		
//	}

		// 사장, 부장, 과장, 대리, 주임, 사원, 나
		// 사장의 연봉은 얼마 입니다.
		// 100, 100
		
		// int num = 5;
		String position = "부장";
		
		switch (position) {
		case "사장": // if(position.equls
			System.out.println("사장입니다.");
			System.out.println("연봉은 10억입니다.");
			break;
		case "부장":
			System.out.println("부장입니다. ");
			System.out.println("연봉은 2억입니다.");
			break;
		case "과장":
			System.out.println("과장입니다.");
			System.out.println("연봉은 1억입니다.");
			break;
		case "대리":
			System.out.println("대리입니다.");
			System.out.println("연봉은 5000만원입니다.");
			break;
		case "주임":
			System.out.println("주임입니다.");
			System.out.println("연봉은 3000만원입니다.");
			break;
		case "사원":
			System.out.println("사원입니다.");
			System.out.println("연봉은 2500만원입니다.");
			break;
		case "나":
			System.out.println("나.");
			System.out.println("연봉은 100억입니다.");
			break;

		default:
			System.out.println("아무 직급도 아닙니다.");
			break;
		}
		
		
		
}
}