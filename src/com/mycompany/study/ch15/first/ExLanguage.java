package com.mycompany.study.ch15.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<String>list = new ArrayList<String>(); //generic
//		String[]a;
		List<String>list = new LinkedList<String>();       
		
		list.add("JAVA");
		list.add("Python");
		list.add("Node");
		list.add(2,"C#");// 인덱스 위치를 지정해서 넣을때 
		
		
		//size 데이터 총합 Array에 들어있는
//		for(int i=0; i<list.size();i++) {
//			System.out.println("list.get("+i+"):" +list.get(i));
//		}
//		System.out.println("-------------------");
		
		int i=0;
		for(String a:list) {
			// String a = list[i];
			System.out.println(i+":"+a);
			i++;
		}
		
		
		
		

		
		
		
//		ArrayList<String> arrayList = new ArrayList<String>();
//		
//		list.add("JAVA");
//		list.add("Python");
//		list.add("Node");
//		list.add(2,"C#");// 인덱스 위치를 지정해서 넣을때 
//		
//		
//		//size 데이터 총합 Array에 들어있는
//		for(int i=0; i<list.size();i++) {
//			System.out.println("list.get("+i+"):" +list.get(i));
//		}
//		System.out.println("-------------------");
//		
//		for(String a:list) {
//			// String a = list[i];
//			System.out.println("a:"+a);
//		}
		
//		ArrayList<String> arrayList = new ArrayList<String>();
		
//		List<String>list = new ArrayList<String>();
	}

}
