package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Triangle implements InitializingBean, DisposableBean {

	private Point point;
	private Point point12;

	public Triangle() {
		System.out.println("Default Constructory");
		/*point = new Point();
		point.setPointX(1234);*/
	}
	
	public Triangle(Point point) {
		System.out.println("One Parameter Constructory");
		this.point = point;
	}
	
	public Triangle(Point point, Point point12) {
		System.out.println("Two Parameter Constructory");
		System.out.println(point.getPointX());
		System.out.println(point12.getPointX());
		this.point = point;
		this.point12 = point12;
	}
	
	
	public void setPoint(Point point) {
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint12(Point point12) {
		this.point12 = point12;
	}

	public Point getPoint12() {
		return point12;
	}

	public void afterPropertiesSet() throws Exception {

		System.out.println("Executed afterPropertiesSet");
	}

	public void destroy() throws Exception {

		System.out.println("Excuted destroy");
	}
	
	public void afterPropertiesSet2() throws Exception {

		System.out.println("Executed afterPropertiesSet2");
	}

	public void destroy2() throws Exception {

		System.out.println("Excuted destroy2");
	}
	
	public void afterPropertiesSet3() throws Exception {

		System.out.println("Executed afterPropertiesSet3");
	}

	public void destroy3() throws Exception {

		System.out.println("Excuted destroy3");
	}


}
