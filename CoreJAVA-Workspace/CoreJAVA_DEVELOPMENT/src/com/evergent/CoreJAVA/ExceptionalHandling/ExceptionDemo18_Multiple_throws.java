package com.evergent.CoreJAVA.ExceptionalHandling;

public class ExceptionDemo18_Multiple_throws {
	String name =null;
	int k=0;
	public void mydata() throws NullPointerException,ArithmeticException{
		System.out.println("One");
		
		int d=10/k;
		System.out.println(d);
		System.out.println(name.length());
		System.out.println("End");
		
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo18_Multiple_throws ed2=new ExceptionDemo18_Multiple_throws();
			ed2.mydata();
		}
		catch(Exception e) {
			System.out.println("I can Handle :"+e);
		}
	}

}
