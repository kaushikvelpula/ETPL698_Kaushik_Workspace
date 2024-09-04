package com.evergent.CoreJAVA.constructors;

import java.security.PublicKey;
class student9{
	String name;
	int age;
	public student9(String name,int age){
		this.name=name;
		this.age=age;
	}
	public student9(student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	public void display() {
		System.out.println("name "+name);
		System.out.println("age "+age);
	}
}

public class Program9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student9 st1=new student9("vijay",21);
		student9 st2=new student9(st1);
		st1.display();
		st2.display();
	
	}
}