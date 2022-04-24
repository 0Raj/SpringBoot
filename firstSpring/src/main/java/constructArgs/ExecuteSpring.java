package constructArgs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecuteSpring {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CalculateArea area = ctx.getBean(CalculateArea.class,"calculateArea");
		area.calculateArea();
		
	

	}

}
