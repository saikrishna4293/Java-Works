package com.threads.topic17th.deadlock.gc;

public class ThreadCall {

	ThreadMethods obj;
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadMethods t1 = new ThreadMethods();
		t1.setName("sub_Thread 1");
		
		ThreadMethods t2 = new ThreadMethods();
		t2.setName("sub_Thread 2");

		ThreadMethods t3 = new ThreadMethods();
		t3.setName("sub_Thread 3");
		
		t1.start();
		t1.join();
		t2.start();
		synchronized (t2){
			t2.wait();
		}
		t3.start();
		
		
		
		System.gc(); //instructing JVM to invoke garbage collector. 
		
		for(int i=0;i<6;i++){
			System.out.println("Thread:  "+Thread.currentThread().getName()+",  count: "+i);
		}
	}
	public void finalize() throws Throwable{
		obj = null;
	}
}
