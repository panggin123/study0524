package com.mycompany.study.ch15.first.tr;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.mycompany.study.ch15.first.Language;

public class ExMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Member>members = new ArrayList<Member>();
		
		
		Member member1 = new Member("스폰지밥","1111","2222","바다 어","1111");
		Member member2 = new Member("뚱이","2222","3333","바다 어딘","1111");
		Member member3= new Member("징징이","3333","4444","바다 어딘가","1111");

		members.add(member1);
		members.add(member2);
		members.add(member3);
		
		
		for(Member member : members) {
			System.out.print(member .name);
			System.out.print(member .ID);
			System.out.print(member .pwd);
			System.out.print(member .adderss);
			System.out.print(member .phone);
			System.out.println();
		}
		
		
	



//	
//
//	for(Member member :arrayList) {
//		System.out.println(member.name);
//
//	}
		
	}

}
