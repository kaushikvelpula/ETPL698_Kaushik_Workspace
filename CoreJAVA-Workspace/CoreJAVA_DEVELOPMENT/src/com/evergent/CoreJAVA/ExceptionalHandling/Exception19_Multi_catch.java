package com.evergent.CoreJAVA.ExceptionalHandling;

public class Exception19_Multi_catch {
	String name=null;
	int k=0;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
			
		}
		catch(NullPointerException | ArithmeticException e) {
			System.out.println("I can Handle :"+e);
		}
	}
	public static void main(String[] args) {
		Exception19_Multi_catch ed2 = new Exception19_Multi_catch();
		ed2.myData();
	}
	
}
