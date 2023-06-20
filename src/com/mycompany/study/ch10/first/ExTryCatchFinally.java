package com.mycompany.study.ch10.first;

public class ExTryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class clazz = Class.forName("ExTry");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없으니 다른 것으로 해 주세요");
		}
	}

}
