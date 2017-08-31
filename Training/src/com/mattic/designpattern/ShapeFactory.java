package com.mattic.designpattern;

public class ShapeFactory {
	public Shape getShape(String shape){
		if("circle".equalsIgnoreCase(shape)) {
			return new Circle(1,"red");
		}else if("square".equalsIgnoreCase(shape)){
			return new Square();
		}else if("rectangle".equalsIgnoreCase(shape)){
			return new Rectangle();
		}
		
		return null;
	}
}
