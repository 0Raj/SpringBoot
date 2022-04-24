package constructArgs;
public class Square extends Shape {
	
	private int side;

	@Override
	public int area() {
		return this.side*this.side;
	}

	public Square(int side) {
		super();
		this.side = side;
	}
	
	

}
