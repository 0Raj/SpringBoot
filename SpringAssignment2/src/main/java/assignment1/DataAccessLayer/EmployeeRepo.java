package assignment1.DataAccessLayer;

import java.util.List;

import assignment1.DAOBean.Employee;

public interface EmployeeRepo {
	public boolean insertEmployeeDetails(Employee emp);
	public List<Employee> getAllEmployeeDetails();
	public Employee findEmployee(int empId);
	public String deleteEmployeeDetailsById(int empId);
}
