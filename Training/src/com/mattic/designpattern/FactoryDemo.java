package com.mattic.designpattern;

public class FactoryDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		/* Get instance of circle */
		Shape circle = shapeFactory.getShape("circle");
//		circle.draw();
		
		/* Get instance of square */
		Shape square = shapeFactory.getShape("square");
		square.draw();
		
		/* Get instance of rectangle */
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
	}

}
