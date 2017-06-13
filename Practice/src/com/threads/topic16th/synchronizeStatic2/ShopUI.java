package com.threads.topic16th.synchronizeStatic2;

public class ShopUI extends Thread {

	Shop ob; 
	
	public void setOb(Shop ob) {
		this.ob = ob;
	}
	
	public void run(){
		for (int i = 0; i<3; i++){
			ob.chocoBox(5);
		}
	}

	
}
