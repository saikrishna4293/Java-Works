package com.threads.topic16th.synchronizeBlock;

public class ThreadsSB {
	
	public static void main(String[] args) {
	
		BankAccountSBlock Virat_family_act = new BankAccountSBlock();
		
		ThreadMethodsSB t1 = new ThreadMethodsSB();
		t1.setName("brother-account");
		t1.setBankAct(Virat_family_act);
		
		ThreadMethodsSB t2 = new ThreadMethodsSB();
		t2.setName("sister-account");
		t2.setBankAct(Virat_family_act);
			
		t1.start();
		t2.start();
	}
}