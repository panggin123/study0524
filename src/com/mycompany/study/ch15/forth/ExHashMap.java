package com.mycompany.study.ch15.forth;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
	public static void main(String[]args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>(); // standard
		Map<String, String> map2 = new HashMap<>(); // standard
		
		HashMap<String, Integer> hashMap = new HashMap<>(); // not bad
		
		map.put("장원영",100);
		map.put("원빈",90);
		map.put("이혜리",80);
		map.put("전소민",70);
		
//		System.out.println(map.get("장원영"));
//		System.out.println(map.get("원빈"));
//		System.out.println(map.get("이혜리"));
//		System.out.println(map.get("전소민"));
		
		map.remove("원빈"); // 선택한 객체 제외 시키는 것 
		map.clear(); // 모두다 지워 버린다.
		
		
		for(String strKey : map.keySet()) {
			Integer strValue = map.get(strKey);
			System.out.println(strKey +":"+strValue);
		}
	}


}
