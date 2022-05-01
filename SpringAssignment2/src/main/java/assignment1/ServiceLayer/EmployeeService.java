package assignment1.ServiceLayer;

import java.util.List;

import assignment1.DAOBean.Employee;
import assignment1.Exception.EmployeeException;

public interface EmployeeService {
	public boolean saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;
}
