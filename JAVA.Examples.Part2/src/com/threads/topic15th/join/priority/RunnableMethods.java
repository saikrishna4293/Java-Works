package com.threads.topic15th.join.priority;

public class RunnableMethods implements Runnable{
	
	//@Override
	public void run(){
		for (int i=0; i<=5; i++){
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread having nightmares, it isn't sleeping");
			}*/
			System.out.println("Thread name: " + Thread.currentThread().getName()+",  Thread no: "+ i);
		}
	}
}