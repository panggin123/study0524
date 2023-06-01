package com.mycompany.study.ch04;

public class ExSwitch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사장, 부장, 과장, 대리, 주임, 사원, 나
				// 사장의 연봉은 얼마 입니다.
				// 100, 100
		
		String position = "사장";
		
		switch (position) {
		case "사장":
			System.out.println("사장입니다. 연봉100억");
			break;
		case "부장":
			System.out.println("부장입니다. 연봉50억");
			break;
		case "과장":
			System.out.println("과장입니다. 연봉30억");
			break;
		case "대리":
			System.out.println("대리입니다. 연봉20억");
			break;
		case "주임":
			System.out.println("주임입니다. 연봉10억");
			break;
		case "사원":
			System.out.println("사원입니다. 연봉1억");
			break;
		case "나":
			System.out.println("나. 연봉1000억");
			break;
			

		default:
			break;
		}
		
		
		
		
	}

}
