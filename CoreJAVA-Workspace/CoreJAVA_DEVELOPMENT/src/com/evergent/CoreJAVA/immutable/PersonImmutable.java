package com.evergent.CoreJAVA.immutable;

public final class PersonImmutable {
	private final String name;
	private final int age;
	public PersonImmutable(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
public String myname() {
	return name;
}
public int myage() {
	return age;
}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		                                                                                                                                      
//	}

}
