package com.mycompany.study.test123.test0629;

public class ExRemoteControl {

	public static void main(String[] args) {

		Television televison = new Television();
		
		RemoteControl turnOn;
		System.out.println("TV를 켭니다");
		
		RemoteControl setmute;
		System.out.println("무음처리합니다");
		System.out.println("무음해제합니다");
		
		RemoteControl setVolume;
		System.out.println("현재 TV 볼륨:"+ 0);

		
		RemoteControl changeBattery;
		System.out.println("건전지를 교체를 교환합니다");
		
		RemoteControl turnOff;
		System.out.println("TV를 끕니다.");
	}

}
