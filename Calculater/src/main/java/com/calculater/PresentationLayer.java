package com.calculater;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationLayer {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ServiceLayer serviceLayer =  ctx.getBean(ServiceLayer.class,"serviceLayer");
		serviceLayer.doCalculation();
		

	}

}
