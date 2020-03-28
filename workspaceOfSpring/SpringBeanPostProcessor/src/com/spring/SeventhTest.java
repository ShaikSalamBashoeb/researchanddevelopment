package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SeventhTest {

	public static void main(String[] args) {
		System.out.println("main method");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("main method - after spring.xml");
		Triangle t = (Triangle)context.getBean("triangle");
		System.out.println("main method - after getBean");
		System.out.println(t.getPoint().getPointX());
		System.out.println(t.getPoint12().getPointX());
		Point p = (Point)context.getBean("point");
		
	}
	
}
