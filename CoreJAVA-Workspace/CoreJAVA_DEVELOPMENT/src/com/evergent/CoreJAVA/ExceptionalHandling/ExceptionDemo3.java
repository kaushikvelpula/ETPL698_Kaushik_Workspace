package com.evergent.CoreJAVA.ExceptionalHandling;

public class ExceptionDemo3 {
	String nameString="null";
	int k=2;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(nameString.length());
			int t=10/k;
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("i can Handle "+e);
		}
	}
 public static void main(String[] args) {
	ExceptionDemo3 ed2=new ExceptionDemo3();
	ed2.myData();
}
}