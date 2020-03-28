package com.spring;

import org.springframework.beans.factory.annotation.Required;

public class Point {
	
	public Point() {
	}
	
	private int pointX;
	private int pointY;
	
	@Required
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
	
}
