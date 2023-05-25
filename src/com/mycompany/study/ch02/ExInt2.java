package com.mycompany.study.ch02;

import java.util.Scanner;

public class ExInt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		if(a<10) {
			System.out.println("a");
		}else if (a<=30) {
			System.out.println("b");
		}else {
			System.out.println("틀렸다");
		}
		System.out.println("----------------");
		
		int var1 = 10;
		int var2 = 012;
		int var3 = 0xa;
		
		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		
	}

}
