package com.shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DrawShapes shapes = ctx.getBean(DrawShapes.class,"drawShapes");
		shapes.drawShape();
		

	}

}
