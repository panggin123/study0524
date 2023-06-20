package com.mycompany.study.ch13.second;

public class ExProduct {

	public static void main(String[] args) {

		Product<String,Integer> product = new Product<>();
		
		product.setKind("Tony");
		product.setModel(100);
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		
		Product<TV,String> product2 = new Product<>();
		
		TV tv = new TV();
		
		product2.setKind(tv);
		product2.setModel("asdf");
		
		System.out.println(product2.getKind());
		System.out.println(product2.getModel());
		
	}

}
