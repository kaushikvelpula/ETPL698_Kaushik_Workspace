package com.evergent.CoreJAVA.JavaBeans;

//import java.io.Serializable;

public class Employee {
	private int eno;
	private String ename;
	private double sal;
	public void SetEno(int eno) {
		this.eno=eno;
	}
	public int getEno() {
		return eno;
	}
	public void SetEname(String  ename) {
		this.ename=ename;
	}
	public String getEname() {
		return ename;
	}
	public void SetSal(double sal) {
		this.sal=sal;
	}
	public double getSal() {
		return sal;
	}
	

}
