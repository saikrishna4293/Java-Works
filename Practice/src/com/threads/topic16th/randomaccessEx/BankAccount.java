package com.threads.topic16th.randomaccessEx;

public class BankAccount {

	private int bal = 200;
	
	public void wdAmount(int amount){
		System.out.println("THREAD WHICH CHECKS BALANCE: "+ Thread.currentThread().getName()+", Balance: "+bal);
		if (bal>140){
		/*	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		*/	bal = bal-amount;
			
			System.out.println("Thread which withdraws amount: "+ Thread.currentThread().getName()+
					" balance after withdrawl: "+bal);
		}
		else{
			System.out.println("Thread: " + Thread.currentThread().getName()+"  insufficient balance");
		}
	}
}
