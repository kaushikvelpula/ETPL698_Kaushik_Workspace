package com.evergent.CoreJAVA.oops;

public class Has_A_relationship {
	public void show() {
	System.out.println("Show method");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Has_A_relationship has= new Has_A_relationship() ;
		has.show();
		PersonInfo person = new PersonInfo();
		person.Info();
		
	}

}
