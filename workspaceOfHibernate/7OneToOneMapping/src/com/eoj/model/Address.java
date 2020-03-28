package com.eoj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int sNo;
	
	@Column(name="MY_CITY")
	private String city;
	
	@Column(name="MY_STREET")
	private String street;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setSNo(int sNo) {
		this.sNo = sNo;
	}

	public int getSNo() {
		return sNo;
	}

}
