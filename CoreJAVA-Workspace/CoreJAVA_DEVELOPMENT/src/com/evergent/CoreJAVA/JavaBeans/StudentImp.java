package com.evergent.CoreJAVA.JavaBeans;

public class StudentImp {
	public static void main(String[] args) {
		StudentBean stu=new StudentBean();
		stu.SetSno(100);
		stu.SetSname("KAKA");
		stu.SetAddress(" hyderabad");
	System.out.println(stu);
	}

}
