package com.evergent.CoreJAVA.abstract1;

public class ProductImp1 extends Product{
	public void newproduct() {
		System.out.println("M new product");
	}
	public void show() {
		System.out.println("Local method");
	}
	public static void main(String args[]) {
		ProductImp1 p1= new ProductImp1();
		p1.newproduct();
		p1.show();
		p1.allproducts();
	}
}
