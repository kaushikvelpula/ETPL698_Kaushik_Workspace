package com.evergent.CoreJAVA.oops;

public class PersonInfo {
	String Pname="Kaushik";
	int Page=12;
	String Address="Hyderabad";
	public void Info()
	{
		System.out.println("Name:"+Pname+"\tAge"+Page +"Address"+ Address );
	}
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonInfo per= new PersonInfo();
		per.Info();

	}

}
