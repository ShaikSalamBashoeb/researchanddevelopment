package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThirdTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)context.getBean("triangle2");
//		System.out.println(t.getListOfPoints().get(0).getPointY());
		System.out.println(t.getMapOfPoints().get("firstKey"));
		
	}
	
}
