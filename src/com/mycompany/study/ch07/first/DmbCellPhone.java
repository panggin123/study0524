package com.mycompany.study.ch07.first;

public class DmbCellPhone extends CellPhone{

// child class

	//필드
	int channel;
	
	//메소드
	void turnOnDmb() {
		powerOn();
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}	
	void turnOffDmb(int a) {
		
	}
	
	@Override
	void powerOff() {
		System.out.println("dmb.powerOff");
	}
	
	@Override
	void powerOn(int a) {
	// 오버라이드	
		// 오버로드의 내용을 바꾸기 위해 필요
		System.out.println("ㅎㅇㅎㅇㅎㅇㅎㅇㅎ");
	}
}
