package com.everegent.CoreJAVA.Collections.Threads;

class Myclass extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		Myclass t1=new Myclass();
		//t1.setPriority(5);
		t1.start();
		Myclass t2=new Myclass();
	//	t2.setPriority(1);
		t2.start();
	}

}
