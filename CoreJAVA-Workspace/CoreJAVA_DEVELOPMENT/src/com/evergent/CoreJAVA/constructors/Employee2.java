package com.evergent.CoreJAVA.constructors;

public class Employee2 {
	int eno;
	String ename;
	double sal;
	Employee2(){
		System.out.println("Default Constructor");
	}
	Employee2(int eno1, String ename1, double sal1){
		eno=eno1;
		ename=ename1;
		sal=sal1;
		System.out.println(eno+ename+sal);
	}
	public void display() {
		System.out.println("Emp no " + eno);
		System.out.println("Emp name " + ename);
		System.out.println("Emp sal " + sal);
	}

	public static void main(String[] args) {
		new Employee2();
		Employee2 emp=new Employee2(123,"Raj",67899);
		emp.display();
		// TODO Auto-generated method stub

	}

}
