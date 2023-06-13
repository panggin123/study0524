package com.mycompany.study.ch07.third;

public class ExSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Phone phone = new Phone(); (X)   abstract는 생성 하면 오류가 난다.
		
		SmartPhone smartPhone = new SmartPhone("smart");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.open();
	}

}
 