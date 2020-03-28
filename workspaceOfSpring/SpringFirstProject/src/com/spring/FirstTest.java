package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class FirstTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)context.getBean("triangle");
		System.out.println(t.getName());
		System.out.println(t.getType());
		System.out.println(t.getSNo());
		System.out.println(t.getDNo());
		t.draw();
		
	}

}
