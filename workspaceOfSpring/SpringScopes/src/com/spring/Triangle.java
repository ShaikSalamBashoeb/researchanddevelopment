package com.spring;


public class Triangle {

	private Point point;

	public Triangle() {
		System.out.println("Default Constructory");
	}
	
	public void setPoint(Point point) {
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}

}
