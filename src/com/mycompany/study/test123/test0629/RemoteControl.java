package com.mycompany.study.test123.test0629;


public interface RemoteControl {

	public int max_volume = 10;
	public int min_volume = 0;
	
	public void turnon();
	public void turnoff();
	public void setvolume(int volume);
	
	default void setMute(boolean mute){
   		if(mute){
        	System.out.println("무음 처리");
        }else{
        	System.out.println("무음 해제");
        }
    }
	
    static void changeBattery(){
        System.out.println("건전지를 교체를 교환합니다");
	
    }
}
