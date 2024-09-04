package com.evergent.CoreJAVA.oops;
 class OverRiding {
	public void show() {
		System.out.println("Parent class");
	}}

public class Child extends OverRiding{
	public void show() {
		System.out.println("Child class");
	}

	
	
	
	public static void main(String args[]) {
		Child or = new Child();
		or.show();
	}
}
