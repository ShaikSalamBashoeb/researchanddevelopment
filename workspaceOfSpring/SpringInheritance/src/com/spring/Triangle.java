package com.spring;


public class Triangle {

	private Point point;
	private Point point12;

	public Triangle() {
		System.out.println("Default Constructory");
		point = new Point();
		point.setPointX(1234);
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

}