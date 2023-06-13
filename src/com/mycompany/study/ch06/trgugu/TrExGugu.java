package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Scanner scanner = new Scanner(System.in);
//		
//		int result = scanner.nextInt();
//		System.out.println("result:" + result);

		Gugu gugu = new Gugu();
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("");
		}

    }


		
}


