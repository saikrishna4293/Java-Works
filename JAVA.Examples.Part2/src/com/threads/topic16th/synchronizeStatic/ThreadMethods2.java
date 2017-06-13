package com.threads.topic16th.synchronizeStatic;

public class ThreadMethods2 extends Thread {

	public void run() {
		for (int i=0; i<=5; i++){
			System.out.println("Thread name: " + Thread.currentThread().getName()+",  Thread no: "+ i);
		}
	}
	
}
