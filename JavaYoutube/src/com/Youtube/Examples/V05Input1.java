package com.Youtube.Examples;

import java.util.Scanner;

public class V05Input1 {

	public static void main(String[ ] args) {

		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int x =scan.nextInt();
		System.out.println("Entered value is: " + x);
		
		System.out.println("\n"+ "Enter any word");
		Scanner scan2 = new Scanner(System.in);
		String y =scan2.nextLine();
		System.out.println("Entered Word is: " + y);
	}

}
