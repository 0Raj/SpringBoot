package assignment1.ServiceLayer;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import assignment1.DAOBean.Employee;
import assignment1.Exception.EmployeeException;
import assignment1.Util.MyEntityManager;

@Repository
public class EmployeeServiceImplementation implements EmployeeService {

	@Override
	public boolean saveEmployee(Employee emp) {
		
		boolean flag = true;
		EntityManager em = MyEntityManager.provideEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
		}catch (Exception e) {
			// TODO: handle exception
			flag = false;
			System.out.println(e.getMessage());
		}
		
		em.close();
		
		return flag;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = null;
		
		EntityManager em = MyEntityManager.provideEntityManager();
		
		String jpql = "select a from Employee a";
		
		TypedQuery<Employee> myQuery = em.createQuery(jpql,Employee.class);
		
		empList = myQuery.getResultList();
		em.close();
		
		return empList;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp = null;
		
		EntityManager em = MyEntityManager.provideEntityManager();
		
		 emp = em.find(Employee.class, empId);
		 em.close();
		 
		return emp;
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String msg = "Deleted Successfully";
		EntityManager em = MyEntityManager.provideEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		try {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
		}catch (Exception e) {
			msg = "Not Deleted ";
			System.out.println(e.getMessage());
		}
		
		em.close();
		
		return msg;
	}

}
