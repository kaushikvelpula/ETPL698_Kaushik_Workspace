package com.evergent.CoreJAVA.Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		mylist.add(100);
		mylist.add("Hello");
		mylist.add(20.50);
		mylist.add(100);
		System.out.println(mylist);
		Iterator i = mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
