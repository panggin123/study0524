package com.mycompany.study.ch05;

import java.io.StreamCorruptedException;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[]scoreEnglish;
//		int scoreMath;
//		
//		String[] name;
//		String name2[];
//		
//		double[] total;
//		double avg[];
//		
//		char[]grade202301;
//		char grade202302[];
//		
//		boolean[]score;
//		boolean score2[];
		
		int[]scoreChemistry = {100,99,98,97,96,95,94};
		
		// scoreChemistry[7] = 93; // 컴파일 error
		// scoreChemistry[2] = 500;
		
		String[]scoreStudent = {"이한위","이제성","김범수","신용재","더원"};
		char[]scoreGrade = {'A','B','C','D','F' };
		
		// int[]scorePhysics;
		// scorePhysics = {100,99,98,97,96}; //error
		// 선언과 동시에 초기화
		
		int a = scoreChemistry.length;
//		
//		System.out.println(a);
//		
//		System.out.println(scoreChemistry[0]);
//		System.out.println(scoreChemistry[6]);
//		
//		System.out.println("------------------");
		
		int sum = 0;
		for(int i=0; i<a; i++){
			System.out.println(scoreChemistry[i]);
			sum = sum+scoreChemistry[i];
		}
		System.out.println("------------------");
		System.out.println("sum:"+sum);
		System.out.println("------------------");
//		int sum2 = 0;
//		
//		int i = 0;
//		while(i<a) {
//			System.out.println(scoreChemistry[i]);
//			sum2 = sum2+scoreChemistry[i];
//			i++;
//		}
//		System.out.println("------------------");
//		System.out.println("sum2:"+sum);
//		System.out.println("------------------");
//		
//		int sum3 = 0;
//		for(int bb: scoreChemistry) {
//			System.out.println(bb); // 향상된 for문
//			sum3 = sum3+bb;
//		}
//		System.out.println("------------------");
//		System.out.println("sum3:"+sum3);
		
	}

}
