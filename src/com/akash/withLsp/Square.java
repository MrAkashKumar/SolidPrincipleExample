package com.akash.withLsp;

public class Square implements Shape{
	
	private int side;

    public Square(int side) {
        this.side = side;
    }

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
