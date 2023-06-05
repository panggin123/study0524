package com.mycompany.study.ch04;

public class ExForHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.(10*5)
		// ************
		// ************
		// ************
		// ************
		// ************
		// 출력하는 프로그램을 만드시오
		
		// 2.(1,10)번째 출력
		// ************
		//	*	*
		//	*	*
		//	*	*
		// ************
		//출력하는 프로그램을 만드시오

		
		for(int i=1; i<=5; i++) {
		for(int j=1; j<=10; j++) {
			System.out.print("*");
		}
					System.out.println("*");
		}
		System.out.println("---------------------------");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------");
		

		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("1"+" "+"3"+" "+"5"+" "+"7"+" "+"9"+" "+"10");
		
		System.out.println("--------------------------");
		
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		}
	}
