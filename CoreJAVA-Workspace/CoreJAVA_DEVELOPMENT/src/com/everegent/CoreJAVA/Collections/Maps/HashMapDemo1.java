package com.everegent.CoreJAVA.Collections.Maps;
import java.util.HashMap;
public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap myMap = new HashMap();
		myMap.put(null,"xyz");
		myMap.put(100,"Ramesh");
		myMap.put(200,"3333");
		myMap.put(300,"Abass");
		myMap.put(100,"Welcome");
		myMap.put(null,"abc");
		myMap.put(700,987);
//		myMap.put(null,"xyz");
		myMap.put(600,"null");
		System.out.println(myMap);
		//non synchronized
	}
}
