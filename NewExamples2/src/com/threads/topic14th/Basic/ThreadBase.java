package com.threads.topic14th.Basic;

public class ThreadBase {

	public static void main(String[] args) {
		ThreadOMethod t1 = new ThreadOMethod();
		t1.setName("Thread one---");
		
		ThreadOMethod t2 = new ThreadOMethod();
		t2.setName("Thread two---");
		
		ThreadOMethod t3 = new ThreadOMethod();
		t3.setName("Thread three-");
		
		Thread t4 = new Thread(new ThreadOMethod());
		t4.setName("Thread four--");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
