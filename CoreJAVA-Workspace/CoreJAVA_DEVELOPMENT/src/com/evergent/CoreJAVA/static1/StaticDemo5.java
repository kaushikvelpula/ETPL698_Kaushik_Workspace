package com.evergent.CoreJAVA.static1;

public class StaticDemo5 {
	static {
		System.out.println("static block ");
	}
	static String ename="India";
	static public void mydata() {
		System.out.println("mydata");
	}
	public static void main(String args[]) {
		System.out.println(StaticDemo4.cname);
		StaticDemo4.myData();
			
	}
}
                                                       