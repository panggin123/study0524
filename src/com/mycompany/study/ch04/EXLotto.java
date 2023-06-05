package com.mycompany.study.ch04;

public class EXLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//로또번호 생성기
		//현재까지 나온 번호와 중복이 되지 않아야 함
		//https://dhlottery.co.kr/gameResult.do?method=byWin&wiselog=H_C_1_1
		//이곳에서 현재까지 번호 다운 가능
		//중복 숫자 제거
		//3연속 번호 불가
		//보너스 번호는 제외
		//1070회 진행
		
		// 선생님이 하신방법
		//기존번호 String[]생성
		//동일한 번호가 생성여부 판단하는 Boolean 변수 사용
		//3연속번호인지 판단하는 Boolean 변수 사용
		//기존번호와 같은지 판단하는 Boolean 변수 사용

		//번호 추출
		
		//오름차순 정렬
		
		//중복값 확인
		
		//3연속 번호 걸르기
		
		//추출된 값 String으로 변환
		
		//기존 값들 과 비교
		
		//최종판단
		
		int min = 1;
		int max = 45;
		int random = (int)((Math.random()* (max - min)) + min);
			System.out.println("random:" + random);
			
			
			
			
			
			int lotto[] = new int [6];
			
     	  	// 번호 생성
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
            
       		  	 // 중복 번호 제거
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	System.out.print("로또 번호: ");
	
  	 // 번호 출력
	for(int i=0; i<6; i++) {
		System.out.print(lotto[i] + " ");
	}	
	}
}

