package com.Polymorphism;

public class BiscuitIndus {

	public static void main(String[] args) {
		
		Oreo b2 = new Oreo();

		Biscuit b1 = new Parle_G();
	
		System.out.println("Manufacturing: "+ b1.brand() + ", Type: "+b1.biscuitType());
		System.out.println("Manufacturing: "+ b2.brand() + ", Type: "+b2.biscuitType());
	}

}
