package com.evergent.CoreJAVA.immutable;

public class MainPerson {
	public static void main(String args[]) {
		PersonImmutable person = new PersonImmutable("Raju", 21);
		System.out.println("Name" + person.myname());
		System.out.println("Age"+ person.myage());
	}

}
