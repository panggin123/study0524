package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		TrGugu gugu = new TrGugu();

		while(gugu.z) {
			System.out.println("정수를 입력해주세요");
			int scannerInt = scanner.nextInt(); // 입력받은 문자열을 str에 저장
			
			if(scannerInt !=0) {
				gugu.gugu(scannerInt);
				
			} else {
				System.out.println("프로그램 종료");
				gugu.z = false;
			}
		}

		

    }


		
}


