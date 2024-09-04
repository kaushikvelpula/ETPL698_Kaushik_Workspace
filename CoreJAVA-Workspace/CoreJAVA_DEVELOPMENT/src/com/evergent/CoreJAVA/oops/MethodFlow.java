package com.evergent.CoreJAVA.oops;

public class MethodFlow {
	public void nanr() {
		System.out.println("Hello World");
	}
	public void anr(int a, int b) {
		System.out.println(a+b);
	}
	public int  ar(int a , int b) {
		return(a+b);
	}
	public int nar() {
		return 100;
	}
	public static void main(String args[]) {
		MethodFlow mf = new MethodFlow();
		mf.nanr();
		mf.anr(10, 20);
		int c=mf.ar(2, 30);
		System.out.println(c);
		int k=mf.nar();
		System.out.println(k);
	}

}
