package com.email.inheritance.implement;

public class HondaCar implements Car{

	public static void main(String[] args) {
		HondaCar car1 = new HondaCar();
		car1.getCarModel();
		System.out.println(car1.i);
		System.out.println(car1.b);
		
	}

	public void getCarModel() {
		System.out.println("BMW car 2017 Model");
	}
}
