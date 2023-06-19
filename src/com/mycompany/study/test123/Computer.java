package com.mycompany.study.test123;

public class Computer extends Calculator{
						// extends 상속을 연장 시킨다 하나의 하나씩만 들어갈 수 있다
	@Override
	// @Override 하위 클래스에서 동일한 이름의 메서드를 재정의할 수 있는 특성
	public double cirelArea(double r) {
		
		return r* r* Constants.PA_2;
//		값 변환해서 넣기 (오버로드)
	}
	
	
//	@Override
//	public double cirelArea(double r) {
//		
//		return r*r* Constants.PA_2;
//	}
}
