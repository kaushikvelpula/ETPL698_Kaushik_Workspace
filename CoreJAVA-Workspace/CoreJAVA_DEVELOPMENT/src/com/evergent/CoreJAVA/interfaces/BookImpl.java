package com.evergent.CoreJAVA.interfaces;

public class BookImpl implements Book{
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
		BookImpl book1 = new BookImpl();
		book1.bookAuthor();
		book1.bookTitle();
		book1.bookPrice();
		book1.show();
	}
}

