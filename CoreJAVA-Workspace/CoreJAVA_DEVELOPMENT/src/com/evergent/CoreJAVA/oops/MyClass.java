package com.evergent.CoreJAVA.oops;

public class MyClass extends Calculation{
	public void show(){
		System.out.println("Show methods");
	}

	public static void main(String[] args) {
		MyClass my = new MyClass();
		my.show();
		my.addition();
		// TODO Auto-generated method stub

	}

}
