package com.threads.topic14th.Basic;

public class RunnableInter implements Runnable {

	public void run() {
		for(int i=0;i<6;i++){
			System.out.println("Thread name: " + Thread.currentThread().getName()+",  Thread no: "+ i);
		}
	}

}
