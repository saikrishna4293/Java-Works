package com.Youtube.Examples;

import java.util.Scanner;

public class V06Arithmatic1 {

	public static void main(String[] args) {

		int x, y;
		double ans;
		
		System.out.println("enter first number");
		Scanner scan1 = new Scanner(System.in);
		x = scan1.nextInt();
		
		System.out.println("enter second number");
		Scanner scan2 = new Scanner(System.in);
		y = scan2.nextInt();
		
		System.out.println("what do you want: add or sub or div");
		Scanner scan3 = new Scanner(System.in);
		String str = scan3.nextLine();

		if (str.equalsIgnoreCase("add")){
				ans = x+y;
				System.out.println("addition is : "+ ans);
		}if(str.equalsIgnoreCase("sub")){
				ans =x-y;
				System.out.println("subtraction is: "+ans);
		}if(str.equals("div")){
				ans = x/y;
				System.out.println("division is: "+ans);
		}
	}
}
