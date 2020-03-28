package com.spring;

public class Point {
	
	public Point() {
		System.out.println("Default Constructory - Point");
		System.out.println("Default Constructory - Point x:"+pointX);
		System.out.println("Default Constructory - Point y:"+pointY);
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
		System.out.println("Executed afterPropertiesSet3 - Point x:"+pointX);
		System.out.println("Executed afterPropertiesSet3 - Point y:"+pointY);
	}

	public void destroy3() throws Exception {

		System.out.println("Excuted destroy3 - Point");
	}

}
