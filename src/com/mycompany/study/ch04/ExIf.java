package com.mycompany.study.ch04;

import java.util.Scanner;

public class ExIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
		
		// ch04.01
		
		// if-학점 계산

		int score = 97;
		
		// int score = sc.nextInt();
		
//		if(score>=90&&score<=100) {
//			System.out.println("A");
//		}if(score==97){
//			System.out.println("A+");
//		}if(score==93) {
//			System.out.println("A-");
//		}else if(score<=89&&score>=80) {
//			System.out.println("B");
//		}if(score==87) {
//			System.out.println("B+");
//		}if(score==83) {
//			System.out.println("B-");
//		}else if(score<=79&&score>=70) {
//			System.out.println("C");
//		}if(score==77) {
//			System.out.println("C+");
//		}if(score==73) {
//			System.out.println("C-");
//		}else if(score<=69&&score>=60) {
//			System.out.println("D");
//		}if(score==67) {
//			System.out.println("D+");
//		}if(score==63) {
//			System.out.println("D-");
//		}else if(score<=59) {
//			System.out.println("F");
//		}else {
//			
//		}
		
		
		
		if(score>=90) {
			if(score>=97) {
				System.out.println("A+");
			}else if(score<97&&score>93) {
				System.out.println("A");
			}else {
				System.out.println("A-");
			}
		}else if(score>=80) {
			if(score>=87) {
				System.out.println("B+");
			}else if(score<87&&score>83) {
				System.out.println("B");
			}else {
				System.out.println("B-");
			}
		}else if(score>=70) {
			if(score>=77) {
				System.out.println("C+");
			}else if(score<77&&score>73) {
				System.out.println("C");
			}else {
				System.out.println("C-");
			}
		}else if(score>=60) {
			if(score>=67) {
				System.out.println("D+");
			}else if(score<67&&score>63) {
				System.out.println("D");
			}else {
				System.out.println("D-");
			}
		}else {
				System.out.println("F");
			}
		}

	}
	


