package com.Youtube.Examples;

public class V15StringUL {

	public static void main(String[] args) {

		String str = "SAIKRISHNA LAKKAVATRI";
		String lowStr = str.toLowerCase();       		//to convert into lower case
		String upStr = lowStr.toUpperCase();			//to convert into upper case
		
		System.out.println("Upper case:  "+str);
		System.out.println("Lower case:  "+lowStr);
		System.out.println("Upper case:  "+ upStr);
		
		System.out.println(str.indexOf('I')); 			//to find the index of a character
		System.out.println(str.replace('A', 'O'));		//to replace a letter in a word
		
	}

}
