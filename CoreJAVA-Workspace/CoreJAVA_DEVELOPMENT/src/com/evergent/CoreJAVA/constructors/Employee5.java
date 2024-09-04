package com.evergent.CoreJAVA.constructors;

public class Employee5 {
	int eno;
	String ename;
	double sal;
	Employee5(int eno){
		this.eno=eno;
		System.out.println("Default Constructor");
	}
	Employee5(int eno, String ename, double sal){
		this(eno);
		this.ename=ename;
		this.sal=sal;
		System.out.println(eno+ename+sal);
	}
	public void display() {
		System.out.println("Emp no " + eno);
		System.out.println("Emp name " + ename);
		System.out.println("Emp sal " + sal);
	}

	public static void main(String[] args) {
		
		new Employee5(123,"Raj",67899).display();
		//emp.display();
		// TODO Auto-generated method stub

	}

}
