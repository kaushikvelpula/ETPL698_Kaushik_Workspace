package com.evergent.CoreJAVA.arrays;

public class DdArray6 {
	public static void main(String args[]) {
		int a[][]=new int[5][5];
		int count=1;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(count +"\t");
				count++;
			}
			System.out.println();
		}
	}

}
