package question3;

public class Circle implements Shape{
	
	final float pi = 3.4f;
	private int radius;
	@Override
	public void area() {
		
		System.out.println("The area of Circle is: "+this.pi*(this.radius*this.radius));
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

}
