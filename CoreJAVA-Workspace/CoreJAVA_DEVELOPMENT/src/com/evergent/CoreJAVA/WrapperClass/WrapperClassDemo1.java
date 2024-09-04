package com.evergent.CoreJAVA.WrapperClass;

import com.evergent.CoreJAVA.immutable.MainPerson;

public class WrapperClassDemo1 {
	public static void main(String[] args) {
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		int a1=i1;
		System.out.println(a1);
	}

}
