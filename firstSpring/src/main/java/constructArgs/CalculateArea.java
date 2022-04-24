package constructArgs;

public class CalculateArea {
	private Shape shape;
	
	public void calculateArea() {
		System.out.println(this.shape.area());
	}

	public CalculateArea(Shape shape) {
		super();
		this.shape = shape;
	}
	
	
}
