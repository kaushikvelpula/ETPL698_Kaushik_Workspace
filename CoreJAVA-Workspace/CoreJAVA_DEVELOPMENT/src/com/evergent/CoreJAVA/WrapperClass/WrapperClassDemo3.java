package com.evergent.CoreJAVA.WrapperClass;

import com.evergent.CoreJAVA.immutable.MainPerson;

public class WrapperClassDemo3 {
	public static void main(String[] args) {
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		int a1=i1;
		System.out.println(a1);
		
		char ch1='a';
		Character abc = new Character(ch1);
		char ch = abc.charValue();
		System.out.println("value of "+ch);
		System.out.println("value of gfg:"+abc);
		
	}
 
}
