package com.evergent.CoreJAVA.interfaces;

public class BookImpl2 implements Book{
	public void bookTitle() {
		System.out.println("Core JAva");
	}
	public void bookAuthor() {
		System.out.println("ORACLE");
		
	}
	public void bookPrice() {
		System.out.println(278);
	}
	public void show() {
		System.out.println("Local meythod");
	}
	public static void main(String args[]) {
		Book book2 = new BookImpl2();
		book2.bookAuthor();
		book2.bookTitle();
		book2.bookPrice();
		//book2.show();
	}
}

