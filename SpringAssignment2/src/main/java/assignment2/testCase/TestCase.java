package assignment2.testCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import assignment2.demo.DemoTwo;
import assignment2.util.AppConfigTwo;

public class TestCase {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigTwo.class);
		
		DemoTwo d = ctx.getBean(DemoTwo.class,"demoTwo");
		
		d.getStudents();
		d.getCities();
		
		AnnotationConfigApplicationContext dClose = (AnnotationConfigApplicationContext) ctx;
		dClose.close();

	}

}
