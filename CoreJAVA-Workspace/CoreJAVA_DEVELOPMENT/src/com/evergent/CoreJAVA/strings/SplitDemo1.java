package com.evergent.CoreJAVA.strings;

public class SplitDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="  Helo  World ra bye ";
		String[] word=string.split(" ");
		for(int i=0;i<word.length;i++) {
			System.out.print(word[i]);
		}
	}

}
