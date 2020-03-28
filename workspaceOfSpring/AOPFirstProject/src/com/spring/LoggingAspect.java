package com.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Around ("args (String)")
	public Object loggingAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("LoggingAspect.loggingAdvice()");
		Circle o = (Circle)pjp.proceed();
//		o.setName("newName");
		System.out.println("LoggingAspect.loggingAdvice()");
		return o;
	}
	
	@Pointcut("args (name)")
	public void allMethods() {
		System.out.println("LoggingAspect.allMethods()");
	}
	
	/*@Before ("execution (* draw())")
	public void loggingAdvice() {
		System.out.println("LoggingAspect.loggingAdvice()");
	}*/
	
	/*@Before ("execution (public void com.spring.Circle.draw(..))")
	public void loggingAdviceWithParameter() {
		System.out.println("LoggingAspect.loggingAdviceWithParameter()");
	}*/
	
	/*@Before ("allMethods()")
	public void loggingAdvice() {
		System.out.println("LoggingAspect.loggingAdvice()");
	}
	
	@Pointcut("execution (* *())")
	public void allMethods() {
		System.out.println("LoggingAspect.allMethods()");
	}*/
	
	/*@Before ("within (com.spring.*) && !allMethods()")
	public void loggingAdvice() {
		System.out.println("LoggingAspect.loggingAdvice()");
	}
	
	@Pointcut("execution (* draw(int))")
	public void allMethods() {
		System.out.println("LoggingAspect.allMethods()");
	}*/
	
	/*@Before ("allMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
		Circle c = (Circle) joinPoint.getTarget();
		System.out.println("LoggingAspect.loggingAdvice()"+c.getName());
	}
	
	@Pointcut("execution (* draw(int))")
	public void allMethods() {
		System.out.println("LoggingAspect.allMethods()");
	}*/

	/*@Before ("args (name)")
	public void loggingAdvice(String name) {
		System.out.println("LoggingAspect.loggingAdvice()"+name);
	}
	
	@Before ("args (String)")
	public void loggingAdvice() {
		System.out.println("LoggingAspect.loggingAdvice()");
	}*/
	
	/*@Around ("args (String)")
	public void loggingAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("LoggingAspect.loggingAdvice()");
		pjp.proceed();
		System.out.println("LoggingAspect.loggingAdvice()");
	}*/
	
	
}
