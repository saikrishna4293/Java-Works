package com.threads.topic15th.join.priority;

public class RunMainBase {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new RunnableMethods());
		t1.setName("Thread one---");
	
		Thread t2 = new Thread(new RunnableMethods());
		t2.setName("Thread two---");
		
		Thread t3 = new Thread(new RunnableMethods());
		t3.setName("Thread three-");
		
		Thread t4 = new Thread(new RunnableMethods());
		t4.setName("Thread four--");
		
		t1.start();
		//t1.join();	//it stops the current threads from executing
		t2.start();
		t1.join();
		t3.start();
		t4.start();
		//t1.start();
		//t1.run();
		//t1.join();
		
		for (int i=0; i<=5; i++){
			System.out.println("Thread name: " + Thread.currentThread().getName()+"---------,  Thread no: "+ i);
		}
	}
}
