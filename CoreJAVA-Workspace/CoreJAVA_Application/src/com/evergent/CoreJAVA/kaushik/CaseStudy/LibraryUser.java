package com.evergent.CoreJAVA.kaushik.CaseStudy;

public interface LibraryUser {
	public void registerAccount(int age)throws InvalidAgeException;
	public void requestBook(String booktype) throws InvalidBookTypeException;

}
