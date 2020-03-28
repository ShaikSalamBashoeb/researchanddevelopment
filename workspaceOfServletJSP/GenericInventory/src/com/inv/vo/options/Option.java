package com.inv.vo.options;

import java.io.Serializable;
import java.sql.Timestamp;

public class Option implements Serializable {

	private String name;
	private String unit;
	private double unitQuantity;
	private double pricePerUnit;
	private double totalPrice;
	private Timestamp createdDate;
	
	public Option() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getUnitQuantity() {
		return unitQuantity;
	}
	public void setUnitQuantity(double unitQuantity) {
		this.unitQuantity = unitQuantity;
	}
	
	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[ name: "+name+", unit: "+unit+", unitQuantity: "+unitQuantity+", pricePerUnit: "+pricePerUnit+", totalPrice: "+totalPrice+" ]");
		
		return builder.toString();
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
}
