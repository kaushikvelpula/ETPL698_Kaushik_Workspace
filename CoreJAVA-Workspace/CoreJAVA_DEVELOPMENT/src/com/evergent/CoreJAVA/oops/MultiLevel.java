package com.evergent.CoreJAVA.oops;
class Persondata {
	public void mypersonata() {
		System.out.println("Person DAta");
	}
}
class Personnfo extends Persondata{
	public void mydetails() {
		System.out.println("PersonInfo class Method");
	}
}
public class MultiLevel extends Personnfo{
		public void show() {
			System.out.println("Local Method");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevel ml = new MultiLevel();
		ml.mypersonata();
		ml.mydetails();
		ml.show();
	}

}
