package com.evergent.CoreJAVA.WrapperClass;
import java.util.ArrayList;
 class Book {
	String name;
	public Book(String name) {
		this.name=name;
		
	}
	public String toString(){
		return name;
	}
	

}

public class CF9_ArrayList_BookObject{
	public static void main(String[] args) {
		Book b1 = new Book("Corejava");
		Book b2=new Book("programming");
		Book b3 = new Book("Let us c");
		ArrayList myList = new ArrayList();
		myList.add(b1);
		myList.add(b2);
		myList.add(b3);
		System.out.println(myList);
	}
}
