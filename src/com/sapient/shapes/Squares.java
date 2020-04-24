package com.sapient.shapes;

public class Squares {
	
	private int sides;
	
	public Squares(int length) {
		this.sides = length;
	}

	public void calculateArea() {
		 System.out.println("The Area of the Square is " + sides  * sides);
	
	}
}
