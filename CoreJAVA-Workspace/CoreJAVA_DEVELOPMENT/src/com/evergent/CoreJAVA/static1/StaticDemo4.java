package com.evergent.CoreJAVA.static1;

public class StaticDemo4 {
	static String cname="India";
	static public void myData()
	{
		System.out.println("My Data");
	}
	public void show() {
		myData();
		System.out.println("mshow"+cname);
	}
	public static void main(String[] args) {
		System.out.println(cname);
		myData();
		StaticDemo4 s4=new StaticDemo4();
		s4.show();
		// TODO Auto-generated method stub

	}

}
