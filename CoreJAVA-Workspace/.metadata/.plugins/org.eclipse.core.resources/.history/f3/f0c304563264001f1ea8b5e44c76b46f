package com.evergent.CoreJAVA.ExceptionalHandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
	public class DemoException10{
		public static void CheckAge(int age) throws InvalidAgeException{
			if(age<18) {
				throw new InvalidAgeException("Age must be 18 or older");
			}
			else {
				System.out.println("Access Granted : you are old enough");
			}
		}
		public static void main(String[] args) {
			try {
				CheckAge(20);
			}
			catch(InvalidAgeException e) {
				System.out.println("caught the exception "+e.getMessage());
				System.out.println(e);
			}
			System.out.println("programs continues after handling exception");
		}
	}


