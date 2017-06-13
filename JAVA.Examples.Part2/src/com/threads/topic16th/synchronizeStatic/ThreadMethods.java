package com.threads.topic16th.synchronizeStatic;

public class ThreadMethods extends Thread{

	BankAccount bankAct;
	
	public void setBankAct(BankAccount bankAct) {
		this.bankAct = bankAct;
	}
	public void run() {
		for (int i=0; i<3; i++){
			try {
				BankAccount.wdAmount(50); 	//calling through class name
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
