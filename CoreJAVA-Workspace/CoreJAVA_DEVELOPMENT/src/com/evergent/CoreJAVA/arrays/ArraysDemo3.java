package com.evergent.CoreJAVA.arrays;

public class ArraysDemo3 {
	public static void main(String args[]) {
		int arr[]=new int[5];
		for(int k=0;k<arr.length;k++) {
			arr[k]=k;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
