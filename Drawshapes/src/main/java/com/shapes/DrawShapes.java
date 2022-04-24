package com.shapes;

public class DrawShapes {

	private Shapes shape;
	
	public void drawShape() {
		this.shape.draw();
	}

	public Shapes getShape() {
		return shape;
	}

	public void setShape(Shapes shape) {
		this.shape = shape;
	}
		
}
