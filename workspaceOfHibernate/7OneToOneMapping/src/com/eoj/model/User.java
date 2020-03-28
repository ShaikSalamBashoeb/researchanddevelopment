package com.eoj.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table (name="USER_DETAILS")
public class User {

	@Id
	@GeneratedValue (strategy= GenerationType.TABLE)
	@Column (name= "USER_ID")
	private int userId;
	
	@Column (name= "USER_NAME")
	private String userName;
	
	@OneToOne
	@JoinColumn(name="ADDRESS_SL_NUMBER")
	private Address address = new Address();
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	
}
