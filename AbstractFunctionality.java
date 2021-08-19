package com.day2;

public class AbstractFunctionality {

	public static void main(String[] args) {
		
		Car car = new Car();
		Truck truck = new Truck();
		car.engineType();
		truck.engineType();
		car.setEngine("ABC");
		car.getEngine();
		System.out.println(car.getEngine());
	}

}
