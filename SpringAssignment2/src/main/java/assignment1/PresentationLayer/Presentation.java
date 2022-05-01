package assignment1.PresentationLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import assignment1.DAOBean.Employee;
import assignment1.DataAccessLayer.EmployeeRepoImplements;

@Controller
public class Presentation {
	
	@Autowired
	EmployeeRepoImplements serviceLayer;
	
	@Value("1")
	int empId;
	
	@Autowired
	Employee emp;
	
	@Value("2")
	int deleteEmpId;
	
	public void present(){
		
		this.serviceLayer.insertEmployeeDetails(this.emp);
		this.serviceLayer.insertEmployeeDetails(this.emp);
		List<Employee> empList = this.serviceLayer.getAllEmployeeDetails();
		
		empList.forEach(System.out::println);
		Employee foundEmp = this.serviceLayer.findEmployee(this.empId);
		System.out.println(foundEmp);
		this.serviceLayer.deleteEmployeeDetailsById(this.deleteEmpId);
		empList.forEach(System.out::println);
		
		
		
		
	}

	public void setServiceLayer(EmployeeRepoImplements serviceLayer) {
		this.serviceLayer = serviceLayer;
	}
	
	
	
}
