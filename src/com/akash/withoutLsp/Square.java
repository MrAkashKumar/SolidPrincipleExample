package com.akash.withoutLsp;

public class Square extends Rectangle {
	
	
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Maintain square's property
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // Maintain square's property
    }
}
