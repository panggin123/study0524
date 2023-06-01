package com.mycompany.study.ch04;

public class ExForOneToTen_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 10까지 더하는 프로그램 작성
		
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum = sum+i;
			System.out.println("i:"+i+"sum:"+sum);
		}
		
	}

}
