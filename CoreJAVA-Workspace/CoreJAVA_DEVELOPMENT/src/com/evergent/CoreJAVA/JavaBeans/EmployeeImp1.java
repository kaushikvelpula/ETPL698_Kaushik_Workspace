package com.evergent.CoreJAVA.JavaBeans;

public class EmployeeImp1 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.SetEno(100);
		emp.SetEname("Ravi");
		emp.SetSal(50000);
		System.out.println("Employee no:"+emp.getEno());
		System.out.println("Employee name"+emp.getEname());
		System.out.println("Employee sal"+emp.getSal());
	}
}
 