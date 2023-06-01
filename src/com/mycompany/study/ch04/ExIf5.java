package com.mycompany.study.ch04;

import java.util.Scanner;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int 타입의 변수를 3개 선언하고
		// 세 정수중에서 최대값,최소값을 구하는 프로그램을 작성하시오

		
		int a = 0;
		int b = 2;
		int c = 3;
		
		
//		if(a>b && a>c) {
//		
//			System.out.println("a는 최댓값");
//		}else if(a<b && a<c){
//			System.out.println("a는 최소값");
//		}else if(b>a && b>c) {
//			System.out.println("b는 최댓값");
//		}else if(b<a && b<c) {
//			System.out.println("b는 최소값");
//		}else if(c>a && c>b) {
//			System.out.println("c는 최대값");
//		}else if(c<a && c<b) {
//			System.out.println("c는 최소값");
//		}else {
//			
//		}
//		

		
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 : " + a);
			} else if (b > a && b > c) {
				System.out.println("최대값은 : " + b);
			} else {
				System.out.println("최대값은 : " + c);
			}
			
			
			
			if(a < b && a < c) {
				System.out.println("최소값은 : " + a);
			} else if ( b < a && b < c ) {
				System.out.println("최소값은 : " + b);
			} else {
				System.out.println("최소값은 : " + c);
			}
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
		}
		
	}

}
