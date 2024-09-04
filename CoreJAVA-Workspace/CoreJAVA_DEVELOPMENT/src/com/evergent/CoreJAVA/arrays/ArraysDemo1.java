package com.evergent.CoreJAVA.arrays;

public class ArraysDemo1 {
	public static void main(String args[]) {
		int arr[]= new int[5];
		arr[0]=12;
		arr[1]=13;
		arr[2]=14;
		arr[3]=15;
		arr[4]=16;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
