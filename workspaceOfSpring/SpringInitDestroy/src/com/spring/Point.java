package com.spring;

public class Point {
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	
	private int pointX;
	private int pointY;
	
	public void setPointX(int pointX) {
		this.pointX = pointX;
	}
	public int getPointX() {
		return pointX;
	}
	public void setPointY(int pointY) {
		this.pointY = pointY;
	}
	public int getPointY() {
		return pointY;
	}
	
	public void afterPropertiesSet3() throws Exception {

		System.out.println("Executed afterPropertiesSet3 - Point");
	}

	public void destroy3() throws Exception {

		System.out.println("Excuted destroy3 - Point");
	}

}
