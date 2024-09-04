package com.evergent.CoreJAVA.constructors;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("Default Constructor");
	}
	Employee3(int eno, String ename, double sal){
		this.eno=eno;
		this.ename=ename;
		sal=sal;
		System.out.println(eno+ename+sal);
	}
	public void display() {
		System.out.println("Emp no " + eno);
		System.out.println("Emp name " + ename);
		System.out.println("Emp sal " + sal);
	}
	public void display2() {
		System.out.println("Emp no " + eno);
		System.out.println("Emp name " + ename);
		System.out.println("Emp sal " + sal);
	}

	public static void main(String[] args) {
		new Employee3();
		new Employee3(123,"Raj",67899).display();
		//emp.display();
		// TODO Auto-generated method stub

	}

}
