package assignment2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import assignment2.DaoBean.Student;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service(value = "demoTwo")
public class DemoTwo {
	
	@Autowired
	private List<Student> students;

	@Autowired
	private List<String> cities;
	
	@PostConstruct
	public void setup() {
		System.out.println("Using init method");
	}
	
	@PreDestroy
	public void destroy(){
	System.out.println("Using PreDestory method");
	}
	
	public void getStudents() {
		System.out.println(this.students);
	}

	public void getCities() {
		System.out.println(this.cities);
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
