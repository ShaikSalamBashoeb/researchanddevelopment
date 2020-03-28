package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FifthTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)context.getBean("triangle");
		System.out.println(t.getPoint().getPointX());
		t.getPoint().setPointX(5);
		Triangle t2 = (Triangle)context.getBean("triangle");
		System.out.println(t2.getPoint().getPointX());		
	}
	
}
