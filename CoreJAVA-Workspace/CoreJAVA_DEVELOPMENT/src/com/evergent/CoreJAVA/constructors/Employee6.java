package com.evergent.CoreJAVA.constructors;

class Employee {
	int eno;
	
	Employee(){
		System.out.println("this is constructor");
	}
	Employee(int eno){
		this.eno=eno;
	}}
public class Employee6 extends Employee{
	String ename;
	double sal;
	Employee6(){
		System.out.println("default constructor");
	}
	Employee6(int eno,String ename,double sal)
		{
	super(eno);
	this.ename=ename;
	this.sal=sal;
		
	}
	public void show() {
		System.out.println("Employee name is"+ename);
		System.out.println("Employee no is"+eno);
		System.out.println("Employee salary is"+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee6();
		new Employee6(123,"vijay",55000).show();
		Employee6 a = new Employee6();
		a.show();
		
		
		
	}
}