package com.eoj.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="ps_person")
public class Employee implements Serializable{

	@Id
	@GeneratedValue (strategy= GenerationType.TABLE)
	private Integer emplid;
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmplid(Integer emplid) {
		this.emplid = emplid;
	}
	public Integer getEmplid() {
		return emplid;
	}
}
