package com.evergent.CoreJAVA.Collections.Queue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Queue_Demo5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Core JAVA");
		list.add("J2ee");
		list.add("j2se");
		list.add("MyJava");
		System.out.println(list);
		Set<String> s = new HashSet<String>();
		s.addAll(list);
		System.out.println(s);
		Set<String> s1 = new HashSet<String>();
		s1.add("Core JAVA");
		s1.add("j2ee");
		s1.add("j2se");
		s1.add("MyJava");
		s1.add("Core JAVA");
		
		if(s.equals(s1)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
			
		}
		System.out.println(s.contains(s1));
	}

}
