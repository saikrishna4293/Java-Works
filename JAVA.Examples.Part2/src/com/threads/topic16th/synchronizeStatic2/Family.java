package com.threads.topic16th.synchronizeStatic2;

public class Family {

	public static void main(String[] args) {

		Shop Chiranjeevi_family = new Shop();
		
		ShopUI t1 = new ShopUI();
		t1.setName("1 RAM CHARAN: ");
		t1.setOb(Chiranjeevi_family);
		
		ShopUI t2 = new ShopUI();
		t2.setName("2 ALLU ARJUN: ");
		t2.setOb(Chiranjeevi_family);

		Thread t3 = new Thread(){
			public void run(){
				Shop.chocoBox(10);
			}
		};
	/*	ShopUI t4 = new ShopUI();
		t4.setName("4 VARUN TEJ: ");
		t4.setOb(Chiranjeevi_family);
	*/
		t3.setName("3 OUTSIDER: ");
		
		t1.start();
		t2.start();
		t3.start();
		//t4.start();
	}
}
