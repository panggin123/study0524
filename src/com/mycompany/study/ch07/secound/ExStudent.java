package com.mycompany.study.ch07.secound;

public class ExStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 명시적 생성자를 사용하여 객체를 생성하고 
				// 모들 필드를 출력하시요
				
				Student student = new Student("hi", "1111111","yellow",30);
				
				System.out.println(student.name);
				System.out.println(student.ssn);
				System.out.println(student.color);
				System.out.println(student.sum);
				System.out.println(student.studentNo);
				
				
				Student student2 = new Student("tony", "22222222","red",50);
				
				System.out.println(student2.name);
				System.out.println(student2.ssn);
				System.out.println(student2.color);
				System.out.println(student2.sum);
				System.out.println(student2.studentNo);
	}

}
