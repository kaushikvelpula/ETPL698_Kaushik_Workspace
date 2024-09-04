package com.evergent.CoreJAVA.oops;

public class Calculation {
	int a =10;
	int b =12;
	int c;
	public void addition() {
		c=a+b;
		System.out.println("Addition "+c);
	}
	public static void main(String args[]) {
		Calculation cal = new Calculation();
		cal.addition();
	}

}
