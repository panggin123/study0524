package com.mycompany.study.ch04;

public class ExEunmWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		Week week;
		String abc;
		

		// abc=Week,MONDAY; // 오류가 나온다
		abc=Week.MONDAY.toString();//"MONDAY."
		
		week= Week.MONDAY;
		
		System.out.println(abc);
		System.out.println();
	}

}