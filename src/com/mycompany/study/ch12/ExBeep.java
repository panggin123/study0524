package com.mycompany.study.ch12;

import java.awt.Toolkit;  // 순수한 자바프로그램을 만드는 것 awt

public class ExBeep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Toolkit toolkit = Toolkit.getDefaultToolkit();      // get은 받아들인다는 의미
															// set은 세팅을 한다는 의미
		for(int i=0; i<5; i++) {		
			toolkit.beep();   //소리내는 함수
			Thread.sleep(500);  
			
		}
	}

}
