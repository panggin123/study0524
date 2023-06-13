package com.mycompany.study.ch07.first;

public class ExMobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CellPhone cellPhone = new CellPhone();
		
		
		cellPhone.powerOn();
		cellPhone.powerOff();
		cellPhone.bell();
		cellPhone.hangUp();
		cellPhone.powerOn(1);
		
		System.out.println("----------------------");
		
		
		MobilePhone mobilePhone = new MobilePhone();
		
		mobilePhone.powerOn();
		mobilePhone.bell();
		mobilePhone.changeChannelDmb(1);
		mobilePhone.powerOn(1);
		
		System.out.println("----------------------");
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOn(1);
		dmbCellPhone.turnOffDmb();
	}

}
