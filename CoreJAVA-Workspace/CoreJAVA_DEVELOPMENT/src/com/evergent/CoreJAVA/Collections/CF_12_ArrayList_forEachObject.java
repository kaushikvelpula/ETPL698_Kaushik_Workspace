package com.evergent.CoreJAVA.Collections;

import java.util.ArrayList;
public class CF_12_ArrayList_forEachObject {
	public static void main(String[] args) {
		
	
	ArrayList<Object> mylist=new ArrayList<>();
	mylist.add(100);
	mylist.add("ven");
	mylist.add("ram");
	mylist.add(45);
	mylist.add(50);
	for(Object o:mylist) {
		System.out.println(o);
	}
}}