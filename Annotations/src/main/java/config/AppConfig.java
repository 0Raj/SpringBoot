package config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "config")
public class AppConfig {

	@Bean("cities")
	public List<String> saveCities(){
		List<String> cities = new ArrayList();
		cities.add("delhi");
		cities.add("chennai");
		cities.add("mumbai");
		cities.add("kolkata");
		return cities;
		
	}
}
