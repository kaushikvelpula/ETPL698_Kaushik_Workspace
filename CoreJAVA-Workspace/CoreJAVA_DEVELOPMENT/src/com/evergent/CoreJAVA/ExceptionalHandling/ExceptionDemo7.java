package com.evergent.CoreJAVA.ExceptionalHandling;

public class ExceptionDemo7 {
	String nameString="null";
	int k=0;
	public void myData() throws ArithmeticException 
	{
		
			System.out.println("one");
			System.out.println(nameString.length());
			int t=10/k;
			System.out.println("End");
		
		
	}
 public static void main(String[] args)throws ArithmeticException {
	 try {
	ExceptionDemo7 ed2=new ExceptionDemo7();
	ed2.myData();
	 }
	 catch(ArithmeticException e) {
		 System.out.println(e);
	 }
}
}