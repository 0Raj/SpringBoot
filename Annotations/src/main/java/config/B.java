package config;

import org.springframework.stereotype.Service;

@Service
public class B {
	public void funB() {
		System.out.println("inside funB of B");
	}

	@Override
	public String toString() {
		return "B []";
	}
	
}
