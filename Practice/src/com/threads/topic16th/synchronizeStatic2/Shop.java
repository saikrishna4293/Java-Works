package com.threads.topic16th.synchronizeStatic2;

public class Shop {

	private static int chocolates = 40;
	public static int ordered = 0;
	
	public static synchronized void chocoBox(int ordered){
		System.out.println(Thread.currentThread().getName()+"came to shop and asked how many chocolates do you have, shop keeper told I have: "+chocolates );
		if (chocolates>10){
			if (ordered == 5){
				chocolates=chocolates-ordered;
			System.out.println(Thread.currentThread().getName()+" bought 5 and chocolates left are: " +chocolates);
			}else{
				chocolates=chocolates-ordered;
				System.out.println(Thread.currentThread().getName()+" bought 10 and chocolates left are: " +chocolates);
				}
		}else{
			System.out.println("--only 10 chocolates left i need for myself");
		}
		
	}
}
