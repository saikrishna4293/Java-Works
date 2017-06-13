package com.threads.topic16th.synchronize;

public class ThreadMethods extends Thread{

	BankAccount bankAct;
	
	public void setBankAct(BankAccount bankAct) {
		this.bankAct = bankAct;
	}
	public void run() {
		for (int i=0; i<3; i++){
			bankAct.wdAmount(20);
		}		
	}
}
