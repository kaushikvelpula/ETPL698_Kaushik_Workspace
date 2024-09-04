package com.evergent.CoreJAVA.strings;

public class StringBufferExample {
	public static void main(String args[]) {
		StringBuffer s= new StringBuffer("Hello");
		s.append("World");
		System.out.println(s);
		s.insert(6, "beautiful");
		System.out.println(s);
		s.replace(0, 5, "hi");
		System.out.println(s);
		s.delete(0, 3);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.length());
	}

}
