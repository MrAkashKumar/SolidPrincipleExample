package com.akash.withoutLsp;

public class Runner {
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println("Rectangle Area: " + rectangle.getArea()); // Output: 200

		/*
		 * Rectangle square = (Rectangle) new Square(); square.setWidth(10);
		 * square.setHeight(20); // This changes both width and height to 20
		 * System.out.println("Square Area: " + square.getArea()); // Unexpected Output:
		 * 400
		 */	}

}
