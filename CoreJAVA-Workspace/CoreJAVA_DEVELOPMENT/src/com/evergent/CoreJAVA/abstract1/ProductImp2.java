package com.evergent.CoreJAVA.abstract1;

public class ProductImp2 extends Product{
	public void newproduct() {
		System.out.println("M new product");
	}
	public void show() {
		System.out.println("Local method");
	}
	public static void main(String args[]) {
		Product p2= new ProductImp2();
		p2.newproduct();
		//p2.show();
		p2.allproducts();
	}
}
