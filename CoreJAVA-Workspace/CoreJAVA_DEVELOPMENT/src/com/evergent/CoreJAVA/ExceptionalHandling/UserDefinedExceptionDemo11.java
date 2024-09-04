package com.evergent.CoreJAVA.ExceptionalHandling;

class InsufficientFundException extends Exception{
	public InsufficientFundException(String message) {
		super(message);
	}
}
	public class UserDefinedExceptionDemo11{
		public static void withdraw(double amount) throws InsufficientFundException{
			double balance=500.00;
			if(amount>balance) {
				throw new InsufficientFundException("Insufficient funds for withdrawal");
			}
			else {
				System.out.println("withdrawal successful");
			}
		}
		public static void main(String[] args) {
			try {
				withdraw(600.00);
			}
			catch(InsufficientFundException e) {
				System.out.println("caught Insuffisent Fund Exception:"+e.getMessage());
			System.out.println(e);
			}
			System.out.println("programs continues after handling exception");
		}
	}


