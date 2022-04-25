package question3;

public class ServiceLayer {
	
	private Shape shape;
	
	public void calculateArea() {
		this.shape.area();
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
}
