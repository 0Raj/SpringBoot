package practice;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private String empAdress;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, String empAdress, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdress = empAdress;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdress=" + empAdress + ", salary=" + salary
				+ "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(this.salary<o.salary)
			return 1;
		else if(this.salary == o.salary)
			return -1;
		return 0;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empAdress, empId, empName, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empAdress, other.empAdress) && empId == other.empId
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
	
	
	
}
