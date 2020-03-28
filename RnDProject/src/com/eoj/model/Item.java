package com.eoj.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="ps_item")
public class Item implements Serializable{

	@Id
	@GeneratedValue (strategy= GenerationType.TABLE)
	private Integer itemid;
	private String itemname;
	private Double price;
	private Double quantity;//kitne kilo/quantity hona(1 kg, 2 kg etc)
	private String unit;//kg, lt, cm etc...
	private Double total;//price * quantity = total
	
	public Integer getItemid() {
		return itemid;
	}
	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
}
