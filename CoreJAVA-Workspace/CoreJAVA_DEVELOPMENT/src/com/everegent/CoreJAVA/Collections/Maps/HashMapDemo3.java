package com.everegent.CoreJAVA.Collections.Maps;

import java.util.HashMap;

public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<String,String> cc = new HashMap<String,String>();
		cc.put("India" ,  "delhi");
		cc.put("Us","Washing");
		cc.put("japn","Tokyo");
		//cc.put("India","delhi");
		cc.put("ghj","yghyh"); 
		
		System.out.println(cc);
		for(String i : cc.keySet()) {
			System.out.println(i);
		}
	}

}
