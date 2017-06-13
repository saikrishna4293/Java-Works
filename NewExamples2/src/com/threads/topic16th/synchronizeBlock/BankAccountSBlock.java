package com.threads.topic16th.synchronizeBlock;

public class BankAccountSBlock {

	private int bal = 200;
	
	public void wdAmount(int amount) throws InterruptedException{
	
		System.out.println("						THREAD WHICH CHECKS BALANCE "+ Thread.currentThread().getName());
		
		synchronized(this){
			System.out.println("Thread which checks balance: "+ Thread.currentThread().getName()+", Balance: "+bal);
			if (bal>140){
				Thread.sleep(1000);
				bal = bal-amount;
				
				System.out.println("Thread which WITHDRAWS amount: "+ Thread.currentThread().getName()+
						" balance after withdrawl: "+bal);
			}else{
				System.out.println("Thread: " + Thread.currentThread().getName()+"  insufficient balance");
			}
	
		}
	}
}
