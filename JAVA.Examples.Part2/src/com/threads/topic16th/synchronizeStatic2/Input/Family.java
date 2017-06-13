package com.threads.topic16th.synchronizeStatic2.Input;

public class Family {
	
	public static void main(String[] args) {

		Shop Chiranjeevi_family = new Shop();
		
		ShopUI t1 = new ShopUI();
		t1.setName("RAM CHARAN: ");
		t1.setOb(Chiranjeevi_family);
		
		ShopUI t2 = new ShopUI();
		t2.setName("ALLU ARJUN: ");
		t2.setOb(Chiranjeevi_family);
		
	/*	Thread t3 = new Thread(){
			public void run(){
				System.out.println("How many chocolates do you want : "+Thread.currentThread().getName());
				Scanner scan = new Scanner(System.in);
				int a = scan.nextInt();
				Shop.chocoBox(a);
			}
		};
		t3.setName("OUTSIDER: ");
		*/
		t1.start();
		t2.start();
		//t3.start();
	}
}
