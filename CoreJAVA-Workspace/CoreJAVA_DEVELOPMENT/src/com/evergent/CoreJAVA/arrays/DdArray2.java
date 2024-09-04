package com.evergent.CoreJAVA.arrays;

public class DdArray2 {
	public static void main(String args[]) {
	int a[][]= new int[5][5];
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(i==j) {
				System.out.print(7);
			}
			else
			{
				System.out.print(1);
			}
		}
		System.out.println();
	}
	

}
}