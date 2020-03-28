package com.eoj.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="city", column=@Column(name="HOME_CITY")),
	@AttributeOverride(name="street", column=@Column(name="HOME_STREET"))
	})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="city", column=@Column(name="COMPANY_CITY")),
	@AttributeOverride(name="street", column=@Column(name="COMPANY_STREET"))
	})
	private Address companyAddress;
	
	
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
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}
	public Address getCompanyAddress() {
		return companyAddress;
	}
	
}
