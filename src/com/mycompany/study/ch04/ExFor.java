package com.mycompany.study.ch04;

public class ExFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2단 부터 구구단 프로그램 출력
		// 각 단계 마다 구분선을 넣어 주세요.
		// 2*1 =2 
		

		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}
		System.out.println("-------------------------");
		}
	}

}
