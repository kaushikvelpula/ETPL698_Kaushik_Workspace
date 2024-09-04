package com.evergent.CoreJAVA.WrapperClass;
import java.util.ArrayList;
public class WrapperClassDemo4 {
	public static void main(String[] args) {
		int a =10;
		Integer i1=new Integer(a);
		ArrayList mylist = new ArrayList();
		mylist.add(100);
		Integer i2=new Integer(100);
		mylist.add(12);
		mylist.add(new Integer(200));
		System.out.println(mylist);
		ArrayList mylist1 = new ArrayList();
		mylist1.add(100);
		System.out.println(mylist1.get(0));
	}

}
