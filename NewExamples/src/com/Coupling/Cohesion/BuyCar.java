package com.Coupling.Cohesion;

public class BuyCar {

	Inter CarModel;
	
	public void setCarModel(Inter carModel) {
		CarModel = carModel;
	}
	public void setModel(){
		CarModel.getCarMethod();
	}
}
