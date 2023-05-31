package com.mycompany.study.ch04;

public class ExIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int 타입의 변수를 1개 선언하고
		// 짝수인지 홀수인지 판다하여 결과를 출력하는 프로그램을 작성하세요.
		
		int a = 2;
		
		// 입력하신 3은 홀수입니다.
		if(a!=0)
		if(a % 2 == 1) {
			System.out.println("홀수입니다");
		}else {
			System.out.println("짝수입니다.");
		}else {
			// a==0
			System.out.println("홀짝 구분 못합니다.");
		}
	
	} 
			
}



