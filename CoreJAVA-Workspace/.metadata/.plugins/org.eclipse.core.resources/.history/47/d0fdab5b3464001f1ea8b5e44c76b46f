package com.evergent.CoreJAVA.ExceptionalHandling;

import java.security.PublicKey;

class InvalidScoreException extends RuntimeException {
	public InvalidScoreException(String message) {
		super(message);
	}
	
}
public class UserDefinedUncheckedExceptionDemo12 {
	public static void ValidateScore(int Score) {
		if(Score<0 || Score>100) {
			throw new InvalidScoreException("Score must be b/w 0 and 100");
		}
		else {
			System.out.println("Score is valid");
		}
		
	}
	public static void main(String[] args) {
		try {
			ValidateScore(110);
		}
		catch(InvalidScoreException e) {
			System.out.println("caught the exception :"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program contimnues after handling the exception");
	}
	
}
