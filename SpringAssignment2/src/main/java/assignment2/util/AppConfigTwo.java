package assignment2.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import assignment2.DaoBean.Student;

@Configuration
@ComponentScan (basePackages = "assignment2")
@PropertySource("city.properties")
public class AppConfigTwo {
	
	@Autowired
	private Environment env;
	
	@Bean
	public List<Student> students(){
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Raj",1,500));
		students.add(new Student("Dhana",2,600));
		students.add(new Student("Gowtham",3,800));
		students.add(new Student("Ram",4,400));
		students.add(new Student("Ravi",5,700));
		
		return students;
	}
	@Bean
	public List<String> cities(){
		List<String> cities = new ArrayList<>();
		cities.add(env.getProperty("student1City"));
		cities.add(env.getProperty("student2City"));
		cities.add(env.getProperty("student3City"));
		cities.add(env.getProperty("student4City"));
		cities.add(env.getProperty("student5City"));
		
		return cities;
	}

	
	
}
