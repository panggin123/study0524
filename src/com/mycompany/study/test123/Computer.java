package com.mycompany.study.test123;

public class Computer extends Calculator{

	@Override
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
