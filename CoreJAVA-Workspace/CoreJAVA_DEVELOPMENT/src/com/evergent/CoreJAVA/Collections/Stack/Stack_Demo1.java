package com.evergent.CoreJAVA.Collections.Stack;
import java.util.Stack;
public class Stack_Demo1 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		//myStack.
		System.out.println(myStack);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
