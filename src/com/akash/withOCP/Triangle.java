package com.akash.withOCP;

public class Triangle implements Shape{
	
	private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

}
