package com.eoj.model;

import javax.persistence.Embeddable;

/**
 *  Address class has to be embedded in other class.
 *
 */
@Embeddable
public class Address {

	private String city;
	
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

}
