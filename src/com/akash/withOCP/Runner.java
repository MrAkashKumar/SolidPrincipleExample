package com.akash.withOCP;

public class Runner {

	public static void main(String[] args) {
		// TODO 
		
		AreaCalculator areaCalculator = new AreaCalculator();
		double response = areaCalculator.calculateArea(new Rectangle(43,2));
		
		
		System.out.println(response);

	}
	
	/*
	 * 			Open closed Principle 
	 * 
	 * Benefits of OCP
	 * 
	 * 1. Maintainability: The code is easier to maintain because adding new functionality does not require changing existing code.
	 * 
	 * 2. Extensibility: New shapes can be added without modifying existing classes, thus reducing the risk of introducing bug
	 * 
	 * 3. Flexibility: The code is more  flexible and can handle new requirements with minimal changes. 
	 * 
	 */

}
