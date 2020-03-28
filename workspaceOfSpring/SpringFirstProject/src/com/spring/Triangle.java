package com.spring;

public class Triangle {

	private String type = "FirstType";
	private String name;
	private int sNo;
	private double dNo;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(String name, double dNo) {
		this.name = name;
		this.setDNo(dNo);
	}
	
	public Triangle(String name, int sNumber) {
		this.name = name;
		this.sNo = sNumber;
	}
	
	/*public Triangle(String name, String type) {
		this.name = name;
		this.type = type;
	}
	*/
	
	public void draw() {
		System.out.println("Triangle drawn");
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setSNo(int sNo) {
		this.sNo = sNo;
	}
	public int getSNo() {
		return sNo;
	}

	public void setDNo(double dNo) {
		this.dNo = dNo;
	}

	public double getDNo() {
		return dNo;
	}
}
