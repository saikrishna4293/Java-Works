package com.threads.topic17th.deadlock.gc;

public class ThreadMethods extends Thread {
	
	//@Override
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Thread:  "+Thread.currentThread().getName()+",  count: "+i);
		if (i==3){
			synchronized (this){
				notify();
			}			
		}
		}
	}
}
