package question3;

public class Square implements Shape{
	
	private int side;
	@Override
	public void area() {
		
		System.out.println("The area of Square is: "+this.side*this.side);
	}
	
	public void setSide(int side) {
		this.side = side;
	}
	
	

}
