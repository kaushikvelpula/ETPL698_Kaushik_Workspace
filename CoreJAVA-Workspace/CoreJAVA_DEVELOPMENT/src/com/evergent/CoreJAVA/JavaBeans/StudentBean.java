package com.evergent.CoreJAVA.JavaBeans;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private String sname;
	private int sno;
	private String address;
	public void SetSname(String sname) {
		this.sname=sname;
	}
	public void SetSno(int sno) {
		this.sno=sno;
	}
	public void SetAddress(String address) {
		this.address=address;
	}
	public String toString() {
		return" student no "+ sno +"\n student name :" +sname +"\n student address"+address;
	}
	
	
	

}
