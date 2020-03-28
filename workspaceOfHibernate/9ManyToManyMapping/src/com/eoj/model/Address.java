package com.eoj.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Address {

	@Id
	private int sNo;
	
	@Column(name="MY_CITY")
	private String city;
	
	@Column(name="MY_STREET")
	private String street;
	
	@ManyToMany(mappedBy="listOfAddress")
	private Collection<User> listOfUsers = new ArrayList<User>();
	
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

	public void setListOfUsers(Collection<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}

	public Collection<User> getListOfUsers() {
		return listOfUsers;
	}

}
