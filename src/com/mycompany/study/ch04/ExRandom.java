package com.mycompany.study.ch04;

public class ExRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//똑같은 숫자 연속 불가
		//123차례대로 불가
		//array사용해서 어렵게 도전
		
		//2개의 번호를 랜덤으로 뽑고 합친값 나오게 하기
		
		
		int min = 1;
		int max = 45;
		int random = (int)((Math.random()* (max - min)) + min);
		System.out.println("random:" + random);
		
//		for(int i=0; i<=1;i++) {
//			random = min+max;
//			System.out.println(random);
//		}
		
		
//		1.JDK
//		2.SUper
//		3.me
		
	}

}