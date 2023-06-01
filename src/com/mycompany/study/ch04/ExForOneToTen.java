package com.mycompany.study.ch04;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1부터 10까지 더하는 프로그램 작성
				int sum = 0;
//		
		// for(int i = 1; ;i++)
//		
//
		for(int i=1; i<=10; i++) {
		sum = sum+i; 
//		// 1: 0+1=1
//		// 2: 1+2=3
//		// 3: 3+3=6
//		// 5: 10+5=15
		System.out.println("i:"+ i + "sum:" + sum);
		
			
	}
		
		
		int sum2 = 0;
		for(int i=11; i<=50; i++) {
			if(i % 2 ==0) {
				sum2 +=i;
				
				System.out.println("i:"+i+"sum2:"+sum2);
			}
		}
	}

}
	

//if(sum!=0) {
//	if(sum %2 == 1) 