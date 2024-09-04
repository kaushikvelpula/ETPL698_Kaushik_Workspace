package com.evergent.CoreJAVA.oops;

public class UserLogin {
	public void logindata() {
		System.out.println("login");
	}
	public void logindata(String name, int age) {
		System.out.println(name);
		System.out.println(age);
		
	}
	public void logindata(String address,String day) {
		System.out.println(address);
		System.out.println(day);
	}
	public void logindata(int number, String password) {
		System.out.println(number);
		System.out.println(password);
		
	}
	public void show() {
		System.out.println("Show Method");
	}
	public static void main(String args[]) {
		UserLogin log= new UserLogin();
		log.logindata();
		log.logindata("kaushik",21);
		log.logindata("hyderabad","Thursday");
		log.logindata(65432,"ksjd8uew");
		log.show();
	}
}
