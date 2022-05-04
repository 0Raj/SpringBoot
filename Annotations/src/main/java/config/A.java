package config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {

	@Autowired
	private B b1;
	
	@Autowired
	private List<String> cities;

	public void funA() {
		System.out.println("inside funA of A");
		System.out.println(b1);
		System.out.println(cities);
	}
}
