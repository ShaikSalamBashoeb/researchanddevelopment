package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThirteenthTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HibernateDaoImpl j = (HibernateDaoImpl)context.getBean("hibernateDaoImpl");
//		j.insertCircle(new Circle(5,"salam5"));
//		j.insertCircleWithNamedPrameter(new Circle(7,"salam7"));
//		System.out.println(j.getCircle().getName());
		System.out.println(j.getCircleSize());
	}
	
}
