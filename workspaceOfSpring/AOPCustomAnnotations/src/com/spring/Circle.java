package com.spring;


public class Circle {

	private String name;
	
	@Loggable
	public String draw() {
		System.out.println("Circle.draw()");
		return null;
	}
	
	public void draw(String name) {
		System.out.println("Circle.draw(int)");
//		draw();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	

}
