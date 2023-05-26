package com.mycompany.study.ch02;

public class TrCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double doubleVar = 123456789;
		System.out.println("doubleVar:" + doubleVar);
		
		float floatVar = (float)doubleVar;
		System.out.println("floatVar:" + floatVar);
		
		long longVar = (long)floatVar;
		System.out.println("longVar:" + longVar);
		
		int intVar = (int)longVar;
		System.out.println("intVar:" + intVar);
		
		short shortVar = (short)intVar;
		System.out.println("shortVar:" + shortVar);
		
		byte byteVar = (byte)shortVar;
		System.out.println("byteVar:" + byteVar);
		
		System.out.println("----------------------------");
		
		
		String stringVar = String.valueOf(intVar);
		System.out.println("stringVar:" + stringVar);
		
		int intVar2 = Integer.parseInt(stringVar);
		System.out.println("intVar:" + intVar2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("-------------------------------------");
		
		
		
		
		
		
		
		String stringVar2 = String.valueOf(intVar);
		System.out.println("stringVar2:" + stringVar2);
		
		int intVar3 = Integer.parseInt(stringVar);
		System.out.println("intVar3:" + intVar3);
	}

}
