package com.eoj.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.eoj.vo.Dog;

public class ServletContextListenerClass implements ServletContextListener {

	
	public void contextInitialized(ServletContextEvent event) {
		
		ServletContext ctx = event.getServletContext();
		
		String name = ctx.getInitParameter("dogName");
		
		Dog dog = new Dog(name);
		
		ctx.setAttribute("dog", dog);
	}
	
	public void contextDestroyed(ServletContextEvent event) {
		
	}
}
