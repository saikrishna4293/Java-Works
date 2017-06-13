package com.threads.topic15th.join.priority;

public class RunnablePrior {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RunnableMethods());   //runnable type
		t1.setName("Thread 1");
		t1.setPriority(Thread.MIN_PRIORITY);
		
		Thread t2 = new Thread(new RunnableMethods());
		t2.setName("Thread 2");
		t2.setPriority(Thread.MAX_PRIORITY);
		
		Thread t3 = new Thread(new RunnableMethods());
		t3.setName("Thread 3");
		t2.setPriority(5);
		
		t2.start();
		t3.start();
		t1.start();
	}
}
