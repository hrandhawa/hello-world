package com.practice;

public class LambdaSession {
	
	public static void main(String[] str) {
		
		Car bmw = new Car();
		bmw.displayColor();
		
		HasColor color = () -> System.out.println("Red White.");
		color.displayColor();
		
	}
}

interface HasColor {
	void displayColor();
}

class Car implements HasColor{
	String model;
	
	public Car() {
		
	}

	@Override
	public void displayColor() {
		System.out.println("White Pearl.");
	}
	
}
