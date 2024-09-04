package com.evergent.CoreJAVA.Collections.Stack;
import java.util.Stack;
public class Stack_Demo4 {
	public static void main(String[] args) {
		Stack <String> myStack = new Stack<>();
		myStack.push("Red");
		myStack.push("Black");
		myStack.push("White");
		myStack.push("Orange");
		//myStack.push(1);
		System.out.println(myStack);
		String topElement = myStack.peek();
		System.out.println("top :"+topElement);
		String RemovedElement = myStack.pop();
		System.out.println(RemovedElement);
		System.out.println(myStack);
		boolean isEmpty = myStack.isEmpty();
		System.out.println(isEmpty);
		int position = myStack.search("Black");
		System.out.println(position);
		//System.out.println();
		myStack.clear();
		System.out.println("Stack after cleaning"+myStack);
		
//		myStack.clear();
//		boolean b = myStack.isEmpty();
//		System.out.println(b);
//		System.out.println(myStack);
//		
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
	}

}
