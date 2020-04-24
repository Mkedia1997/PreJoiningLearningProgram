package com.sapient.shapes;

public class Circles {
	
	private int radius;
	
	public Circles(int length) {
		this.radius = length;
	}

	public void calculateArea() {
		System.out.println("The Area of the Circle is " + 3.14 *radius * radius); 
	}
	
}
