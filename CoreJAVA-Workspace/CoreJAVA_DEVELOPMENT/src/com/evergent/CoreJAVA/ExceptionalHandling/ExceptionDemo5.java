package com.evergent.CoreJAVA.ExceptionalHandling;

public class ExceptionDemo5 {
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
		catch(Exception e) {
			System.out.println();
		}
		finally {
			System.out.println("Finally block for closing");
		}
	}
 public static void main(String[] args) {
	ExceptionDemo5 ed2=new ExceptionDemo5();
	ed2.myData();
}
}