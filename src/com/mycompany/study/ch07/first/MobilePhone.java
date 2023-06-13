package com.mycompany.study.ch07.first;

public class MobilePhone extends DmbCellPhone{

	void aaa() {
		System.out.println("asdf");
		bell();
		hangUp();
		powerOn();
		changeChannelDmb(2);
	}
	
	@Override
	void changeChannelDmb(int Channel) {
		System.out.println("MobilePhone");
	}
	
	@Override
	void powerOn(int a) {
		System.out.println("CellPhone");
	}
}
