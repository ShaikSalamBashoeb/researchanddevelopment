package com.spring;

public class Circle {
	
	private String name;
	private int id;

	public Circle(int i, String string) {
		id = i;
		name = string;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
