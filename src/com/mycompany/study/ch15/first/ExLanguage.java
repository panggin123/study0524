package com.mycompany.study.ch15.first;

import java.util.ArrayList;

public class ExLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Language>arrayList = new ArrayList<Language>();
//		Vector<Language>arrayList = new Vector<Language>();
		
		for(Language language:arrayList) {
			System.out.println("language.name:"+language.name);
			System.out.println("language.version:"+language.version);
		}
		
//		arrayList.add("JAVA");  // Language 객체를 넣어 주어야 되어야 되서 오류
//		arrayList.add(11);		// Language 객체를 넣어 주어야 되어야 되서 오류
		
		
		Language language = new Language("JAVA", 11);
		
		arrayList.add(language);
		arrayList.add(new Language("Python", 8));
		arrayList.add(new Language("C#", 6));

		for(Language a:arrayList) {
			System.out.println("language.name:"+ a.name);
			System.out.println("language.version:"+ a.version);
			System.out.println("----------------------");
		}
		
		
		
		
		
		
		
		
//		
//		ArrayList<Language>arrayList = new ArrayList<Language>();
//		
//		for(Language language :arrayList) {
//			System.out.println(language.name);
//			System.out.println(language.version);
//		}
//		
//		Language language = new Language("JAVA", 11);
//		
//		arrayList.add(language);
//		
//		for(Language a: arrayList) {
//			System.out.println(language.name);
//			System.out.println(language.version);
//			
//		}
		
		
//		List<String>list = new ArrayList<String>(); //generic
//		String[]a;
//		List<String>list = new LinkedList<String>();       
		
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
//		int i=0;
//		for(String a:list) {
//			// String a = list[i];
//			System.out.println(i+":"+a);
//			i++;
//		}
//		System.out.println("-------------------");
//		
//		list.remove(2); //삭제 
//		list.remove("Python");
//		
//		
//		int j=0;
//		for(String a:list) {
//			// String a = list[i];
//			System.out.println(j+":"+a);
//			j++;
//		}
		
		// 오브젝트 시조새 제일 높은 클래스?
		
		
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
