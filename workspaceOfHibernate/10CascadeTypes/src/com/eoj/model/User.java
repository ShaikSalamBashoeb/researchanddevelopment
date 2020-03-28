package com.eoj.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity 
@Table (name="USER_DETAILS")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name= "USER_ID")
	private int userId;
	
	@Column (name= "USER_NAME")
	private String userName;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Address> listOfAddress = new ArrayList<Address>();
	
	
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
	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}
	
}
