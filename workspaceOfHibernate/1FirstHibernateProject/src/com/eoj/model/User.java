package com.eoj.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity (name="USER_DETAILS")
public class User {

	
	private int userId;
	
	private String userName;
	
	/**
	 * It tells the hibernate to use Date as column type in the table.
	 */
	@Temporal (TemporalType.DATE)
	private Date joinDate;
	
	private String firstName;
	
	private int rollNo;
	
	/**
	 * Declare userId as primary key and 
	 * Use Table Strategy to generate the value for this field
	 */
	@Id
	@GeneratedValue (strategy= GenerationType.TABLE)
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
