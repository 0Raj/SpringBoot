package assignment2.DaoBean;

public class Student {

	private String name;
	private int roll;
	private int mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Student(String name, int roll, int mark) {
		super();
		this.name = name;
		this.roll = roll;
		this.mark = mark;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", mark=" + mark + "]";
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
