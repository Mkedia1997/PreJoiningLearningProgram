package com.sapient.shapes;

public class Shapes {
	
	void calculateShapeArea(int numberOfSides, int length) {
		
		switch(numberOfSides) {
		
			case 1: new Circles(length).calculateArea();
					break;
			case 3: new Traingles(length).calculateArea();
					break;
			case 4: new Squares(length).calculateArea();
					break;
			default: System.out.println("No such shape is Present");
		}
	}

	public static void main(String[] args) {
		Shapes calc = new Shapes();
		calc.calculateShapeArea(3,12);
		calc.calculateShapeArea(4,15);
		calc.calculateShapeArea(5,15);		
	}

}
