package com.akash.withLsp;

public class Rectangle implements Shape{
	
	private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

}
