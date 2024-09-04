package com.evergent.CoreJAVA.kaushik.CaseStudy;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
class InvalidBookTypeException extends Exception{
	public InvalidBookTypeException(String message) {
		super(message);
	}
}
public class AdultUser implements LibraryUser{
	
	private int age ;
	private String bookType ;
public void  registerAccount(int age) throws InvalidAgeException{
		
		this.age = age;
        if (age >12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            throw new InvalidAgeException("Sorry, Age must be less than 12 to register as a kid");
        }
	 }
	
	public void requestBook(String bookType)throws InvalidBookTypeException {
		 this.bookType = bookType;
	        if ("Kids".equalsIgnoreCase(bookType)) {
	            System.out.println("Book Issued successfully, please return the book within 10 days");
	        }
	        else {
	            throw new InvalidBookTypeException("Oops, you are allowed to take only kids books");
	        }
	}
//	
//	 AdultUser(int age, String bookType) {
//		 this.age=age;
//		 this.bookType=bookType;
//		// TODO Auto-generated constructor stub
//	}

	
	
}
