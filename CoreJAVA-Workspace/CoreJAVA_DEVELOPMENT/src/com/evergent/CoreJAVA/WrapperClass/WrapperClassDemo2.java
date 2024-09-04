package com.evergent.CoreJAVA.WrapperClass;

public class WrapperClassDemo2 {
	public static void main(String[] args) {
		//int a=10;
		float f1=4.5f;
		System.out.println(f1);
		Float f2=new Float(f1);
		System.out.println(f2);
		float f3=f2.floatValue();
		System.out.println(f3);
		
		
		double d1=100.890;
		System.out.println(d1);
		Double d2=new Double(d1);
		System.out.println(d2);
		double d3=d2.doubleValue();
		System.out.println(d3);
		
		
		byte b1=10;
		System.out.println(b1);
		Byte b2=new Byte(b1);
		System.out.println(b2);
		byte b3=b2.byteValue();
		System.out.println(b3);
		
		
		
		
	}

}
