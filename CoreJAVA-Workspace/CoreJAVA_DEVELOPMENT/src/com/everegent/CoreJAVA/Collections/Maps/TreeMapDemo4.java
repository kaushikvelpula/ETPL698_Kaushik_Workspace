package com.everegent.CoreJAVA.Collections.Maps;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapDemo4 {
	public static void main(String[] args) {
		TreeMap<Integer,String> SR = new TreeMap<>();
		SR.put(102,"Raaju");
		SR.put(101,"Bhanu");
		SR.put(103,"Ramu");
		SR.put(104,"David");
		System.out.println(SR);
		System.out.println("StudentRecords(Sorted byID):");
		for(Map.Entry<Integer, String> entry:SR.entrySet()) {
			System.out.println("ID:"+entry.getKey()+"Name:"+entry.getValue());
		}

}
}
