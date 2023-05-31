package com.mycompany.study.ch04;

public class ExIf1_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 87;

		
		if(score>=90) {
			if(score>=97) {
				System.out.println("A+");
			}else if (score<97&&score>93) {
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
		}else if (score>=70) {
			if(score>=77) {
				System.out.println("C+");
			}else if (score<77&&score>73) {
				System.out.println("C");
			}else {
				System.out.println("C-");
			}
		}else if (score>=60) {
			if(score>=67) {
				System.out.println("D+");
			}else if (score<67&&score>63) {
				System.out.println("D");
			}else {
				System.out.println("D-");
			}
		}else {
			System.out.println("F");
		}
		
		
		
		
		
		
	}

}
