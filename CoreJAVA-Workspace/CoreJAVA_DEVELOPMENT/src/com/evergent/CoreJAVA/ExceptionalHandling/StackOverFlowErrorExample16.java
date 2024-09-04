package com.evergent.CoreJAVA.ExceptionalHandling;

public class StackOverFlowErrorExample16  
{
	public static void main(String[] args) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverFlowError caught:" +e.getMessage());
			
		}
	}
	public static void recursiveMethod() {
		recursiveMethod();
	}
}
