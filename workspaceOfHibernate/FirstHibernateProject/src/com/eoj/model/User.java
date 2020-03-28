package com.eoj.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity (name="USER_DETAILS")
public class User {

	
	private int userId;
	
	private String userName;
	
	@Temporal (TemporalType.DATE)
	private Date joinDate;
	
	@Id
	@Column (name= "USER_ID")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column (name= "USER_NAME")	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
