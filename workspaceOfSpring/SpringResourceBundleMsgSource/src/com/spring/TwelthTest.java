package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TwelthTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)context.getBean("triangle");
		
		System.out.println(context.getMessage("drawing.point", new Object[]{10,11}, "Def text", null));
		
		System.out.println(t.getMessageSource().getMessage("drawing.point", new Object[]{10,11}, "Def text", null));
		
		/*MessageSource m = (MessageSource)context.getBean("messageSource");
		System.out.println(m.getMessage("drawing.point", new Object[]{10,11}, "Def text", null));*/
		
	}
	
}
