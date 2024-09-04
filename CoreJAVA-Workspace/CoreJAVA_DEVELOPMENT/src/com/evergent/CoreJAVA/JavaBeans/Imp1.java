package com.evergent.CoreJAVA.JavaBeans;

public class Imp1 {
	public static void main(String[] args) {
		Product product = new Product(10," Laptop", 88888);
		System.out.println("product no"+ product.getpno());
		System.out.println("product name"+product.getpname());
		System.out.println("product price "+product.getprice());
		
	}

}
