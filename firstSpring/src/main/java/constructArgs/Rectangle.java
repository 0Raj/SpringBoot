package constructArgs;
public class Rectangle extends Shape {
	
	private int length;
	private int breadth;

	@Override
	public int area() {
		return this.length*this.breadth;
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	

}
