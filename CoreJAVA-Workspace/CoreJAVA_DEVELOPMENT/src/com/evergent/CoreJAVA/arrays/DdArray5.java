package com.evergent.CoreJAVA.arrays;

public class DdArray5 {
	public static void main(String args[]) {
		String a[][]= new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				 a[i][j]="JAVA";
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("JAVA \t");
			}
			System.out.println();
		}
	}

}
