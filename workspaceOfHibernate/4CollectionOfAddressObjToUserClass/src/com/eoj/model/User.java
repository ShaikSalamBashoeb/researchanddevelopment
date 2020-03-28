package com.eoj.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
	
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",
			joinColumns =@JoinColumn(name="USER_ID"))
	private Set<Address> listOfAddresses = new HashSet<Address>();
	
	
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
	public void setListOfAddresses(Set<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
	public Set<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	
}
