package com.threads.topic16th.synchronizeStatic2.Input;

import java.util.Scanner;

public class Shop {

	private static int chocolates = 40;
	public static int ordered = 0;

	public static synchronized void chocoBox(){
		System.out.println(Thread.currentThread().getName()+"came to shop and asked how many chocolates do you have");
		System.out.println(" shop keeper told I have: "+chocolates+", How many do you want :" +"\n"+"I want :");
		Scanner scan = new Scanner(System.in);
		ordered = scan.nextInt();
		
		if (chocolates>10){
				chocolates=chocolates-ordered;
			System.out.println(Thread.currentThread().getName()+" bought "+ordered+ " and chocolates left are: " +chocolates);
		}else{
			System.out.println("Sorry "+Thread.currentThread().getName()+" I have only 10 chocolates left, i need for myself");
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
	}
}
