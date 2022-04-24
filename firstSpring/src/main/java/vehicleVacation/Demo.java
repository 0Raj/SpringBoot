package vehicleVacation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Vacation myVacation = ctx.getBean(Vacation.class,"v1");
		myVacation.startVacation();
		
	}

}
