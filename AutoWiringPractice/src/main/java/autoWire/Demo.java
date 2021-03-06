package autoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		// activate the spring container by locating the spring configuration file..
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PresentationBean pbean = ctx.getBean("presentation", PresentationBean.class);
		pbean.present();
	}

}
