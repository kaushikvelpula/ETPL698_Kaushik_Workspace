package com.evergent.CoreJAVA.ExceptionalHandling;

public class ArrayIndexOutOfBoundException13 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		try {
			System.out.println("Accessing elements at index 10"+numbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught");
		}
		System.out.println("program continues running");
	}

}
