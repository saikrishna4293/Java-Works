package com.threads.topic14th.Basic;

public class ThreadOMethod extends Thread{

	//@Override
	public void run(){
		for (int i=0; i<=5; i++){
			System.out.println("Thread name: " + Thread.currentThread().getName()+",  Thread no: "+ i);
		}
	}
}
