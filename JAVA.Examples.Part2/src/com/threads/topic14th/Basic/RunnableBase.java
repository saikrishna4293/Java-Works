package com.threads.topic14th.Basic;

public class RunnableBase {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RunnableInter());   //runnable type
		t1.setName("Thread 1");
		Thread t2 = new Thread(new RunnableInter());
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
	}

}
