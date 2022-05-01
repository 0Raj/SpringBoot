package assignment1.Util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import assignment1.DAOBean.Employee;

@Configuration
@ComponentScan (basePackages = "/SpringAssignment2/src/main/java")
public class AppConfig {

	@Bean
	public Employee createEmp() {
		return new Employee("Raj", "Chennai", 60000);
	}
}
