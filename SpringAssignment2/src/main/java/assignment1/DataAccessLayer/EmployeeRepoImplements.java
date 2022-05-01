package assignment1.DataAccessLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment1.DAOBean.Employee;
import assignment1.Exception.EmployeeException;
import assignment1.ServiceLayer.EmployeeServiceImplementation;

@Service
public class EmployeeRepoImplements implements EmployeeRepo {
	
	@Autowired
	EmployeeServiceImplementation empService;

	@Override
	public boolean insertEmployeeDetails(Employee emp) {
		return empService.saveEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {

		return empService.getAllEmployee();
	}

	@Override
	public Employee findEmployee(int empId) {
		
		
		
		try {
			return empService.getEmployeeById(empId);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public String deleteEmployeeDetailsById(int empId) {

		try {
			return empService.deleteEmployeeById(empId);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return "Not Deleted";
	}

	public void setEmpService(EmployeeServiceImplementation empService) {
		this.empService = empService;
		
	}

	
}
