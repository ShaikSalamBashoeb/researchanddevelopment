package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThirteenthTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl j = (JdbcDaoImpl)context.getBean("jdbcDaoImpl");
//		j.insertCircle(new Circle(5,"salam5"));
//		j.insertCircleWithNamedPrameter(new Circle(7,"salam7"));
//		System.out.println(j.getCircle().getName());
		List<Circle> list = j.getCircleList();
		System.out.println(j.getCircleList().size());
		for (Circle circle : list) {
			System.out.println(circle.getName());
		}
	}
	
}
