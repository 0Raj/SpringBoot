package question3;

public class Rectangle implements Shape{
	
	private int length;
	private int breadth;
	@Override
	public void area() {
		
		System.out.println("The area of Rectangle is: "+this.length*this.breadth);
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	

}
