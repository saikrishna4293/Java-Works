package com.Coupling.Cohesion;

public class Car {

	public static void main(String[] args) {
		BuyCar ob = new BuyCar();
		ToyotaCar TCar = new ToyotaCar();
		ob.setCarModel(TCar);
		ob.setModel();
		HondaCar HCar = new HondaCar();
		ob.setCarModel(HCar);
		ob.setModel();
		
	}

}
