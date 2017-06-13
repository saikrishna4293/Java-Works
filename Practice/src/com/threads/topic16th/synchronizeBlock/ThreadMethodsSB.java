package com.threads.topic16th.synchronizeBlock;

public class ThreadMethodsSB extends Thread{

	BankAccountSBlock bankAct;
	
	public void setBankAct(BankAccountSBlock bankAct) {
		this.bankAct = bankAct;
	}
	public void run() {
		for (int i=0; i<2; i++){
			try {
				bankAct.wdAmount(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
