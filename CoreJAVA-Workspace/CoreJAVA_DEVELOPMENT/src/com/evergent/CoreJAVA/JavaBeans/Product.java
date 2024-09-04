package com.evergent.CoreJAVA.JavaBeans;

import java.io.Serializable;

public class Product implements Serializable{
	private int pno;
	private String pname;
	private double price;
	public Product (int pno, String pname, double price) {
		this.pno=pno;
		this.pname=pname;
		this.price=price;
		
	}
	public int getpno() {
		return pno;
	}
	public String getpname() {
		return pname;
	}
	public double getprice() {
		return price;
	}
	
}
