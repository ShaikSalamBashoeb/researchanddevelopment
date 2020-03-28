package com.spring;



public class Triangle {

	private Point point;
	private Point point12;

	public Triangle() {
	}
	
	public Triangle(Point point) {
		this.point = point;
	}
	
	public Triangle(Point point, Point point12) {
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
