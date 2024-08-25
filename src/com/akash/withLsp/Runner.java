package com.akash.withLsp;

public class Runner {
	
	public static void main(String[] args) {
		
		Shape square = new Square(45);
		System.out.println(square.getArea());
		
		Shape rectangle = new Rectangle(43 , 22);
		System.out.println(rectangle.getArea());
		
	}

}
