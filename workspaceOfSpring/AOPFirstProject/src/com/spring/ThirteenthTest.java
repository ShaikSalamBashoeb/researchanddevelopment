package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThirteenthTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Circle c = (Circle)context.getBean("circle");
//		c.setName("salam");
//		c.draw();
		c.draw("1");
	}
	
}
