package com.mycompany.study.test123.test0629;


public class Television implements RemoteControl{
	
	@Override
	public void turnon() {
	}
	@Override
	public void turnoff() {
	}
	@Override
	public void setvolume(int volume) {
	}

	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	
//	public void setVolume(int volume) {
//		if(volume> RemoteControl.max_volume) {
//			
//			this.volume = RemoteControl.max_volume;
//			
//		}else if(this.volume<RemoteControl.min_volume) {
//			
//			this.volume = RemoteControl.min_volume;
//			
//		}else {
//			this.volume = volume;
//		}
//		System.out.println("현재 TV 볼륨:" + this.volume);
//	}

public void setVolume(int volume) {

		if(volume> RemoteControl.max_volume) {
			
			System.out.println("현재 TV 볼륨: 10");
			
		}else if(volume<RemoteControl.min_volume) {
			
			System.out.println("현재 TV 볼륨: 0");
			
		}else {

		}
}

}
