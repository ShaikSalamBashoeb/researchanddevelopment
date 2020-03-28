package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecTest {

	public static void main(String[] args) {

//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)context.getBean("myTriangle");
		System.out.println(t.getPointA());
		System.out.println(t.getName());
		/*System.out.println(t.getPointA().getPointX());
		System.out.println(t.getPointA().getPointY());
		t.getPointA().setPointX(10);*/
		
		/*Triangle t2 = (Triangle)context.getBean("triangle2");
		System.out.println(t == t2);
		System.out.println(t2.getPointA().getPointX());
		System.out.println(t2.getPointA().getPointY());
		System.out.println(t.getPointA() == t2.getPointA());
		
		Point p = (Point)context.getBean("zeroPoint");
		System.out.println(p.getPointX());
		
		Point p1 = (Point)context.getBean("pointOne");
		System.out.println(p1.getPointX());*/
		
	}
	
}
