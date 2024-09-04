package com.evergent.CoreJAVA.interfaces;

public class BookImpl4 implements Book,NewBook {
	public void dataInfo() {
		System.out.println("new data info");
	}
  public void bookTitle() {
	  System.out.println("java");
  }
  public void bookAuthor() {
	  System.out.println("Oracle");
	  
  }
  public void bookPrice() {
	  System.out.println(278);
	  
  }
  public void myNewBook() {
	  System.out.println("java2");
  }
  public void show() {
	  System.out.println("LOCAL ");
  }
  public static void main(String args[]) {
	  BookImpl4 b1 = new BookImpl4();
	  b1.bookAuthor();
	  b1.bookPrice();
	  b1.bookTitle();
	  b1.myNewBook();
	  b1.dataInfo();
	  b1.show();
	  
  }
}
