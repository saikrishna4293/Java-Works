package com.threads.topic16th.synchronizeStatic;

public class Threads {
	
	public static void main(String[] args) {
	
		BankAccount Virat_family_act = new BankAccount(); 
		
		ThreadMethods t1 = new ThreadMethods();
		t1.setName("brother-account");
		t1.setBankAct(Virat_family_act);
		
		ThreadMethods t2 = new ThreadMethods();
		t2.setName("sister-account");
		t2.setBankAct(Virat_family_act);
		
		ThreadMethods2 t3 = new ThreadMethods2();
		t3.setName("Thread 3");
			
		t1.start();
		t2.start();
		t3.start();
	}
}