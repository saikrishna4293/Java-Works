package com.threads.topic16th.synchronizeStatic;

public class BankAccount {

	private static int bal = 600;
	
	public static synchronized void wdAmount(int amount) throws InterruptedException{
		System.out.println("THREAD WHICH CHECKS BALANCE: "+ Thread.currentThread().getName()+", Balance: "+bal);
		if (bal>450){
			Thread.sleep(1000);
			bal = bal-amount;
			
			System.out.println("Thread which withdraws amount: "+ Thread.currentThread().getName()+
					" balance after withdrawl: "+bal);
		}
		else{
			System.out.println("Thread trying to withdraw amount: " + Thread.currentThread().getName()+"  insufficient balance");
		}
	}
}
