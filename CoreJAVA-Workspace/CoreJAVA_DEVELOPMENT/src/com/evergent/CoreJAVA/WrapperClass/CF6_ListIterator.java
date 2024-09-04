package com.evergent.CoreJAVA.WrapperClass;
import java.util.ArrayList;
import java.util.ListIterator;
public class CF6_ListIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Ramu");
		list.add("ravi");
		list.add("BAlu");
		list.add("Bhanu");
		ListIterator li=list.listIterator();
		li.add("Welcome");
		li.add("Hello");
		while(li.hasNext()) {
			String s = (String) li.next();
			System.out.println(s);
			if(s.equals("bAlu"))
				li.remove();
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
	}

	
	

}
