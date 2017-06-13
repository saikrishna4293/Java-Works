package com.Youtube.Examples;

import java.util.Scanner;

public class V10SwitchEx {

	public static void main(String[] args) {
		
		System.out.println("enter percentage: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("The grade is: ");
		switch(x)
		{
			case 90:
				System.out.println("A -> V good");
				break;
			case 80:
				System.out.println("B -> good");
				break;
			case 70:
				System.out.println("C -> above average");
				break;
			case 60:
				System.out.println("D -> average");
			case 50:
				System.out.println("F -> waste");
				break;
			default :
				System.out.println("grades not defined");
				break;
		}
	}
}
