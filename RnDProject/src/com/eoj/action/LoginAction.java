package com.eoj.action;

import com.eoj.dao.PersonDao;
import com.eoj.model.Employee;

public class LoginAction  {

	private Employee emp;
	public String execute() {
		System.out.println("Execute in Login Action class: "+emp.getUsername());
		System.out.println(": "+emp.getPassword());
		if(!isCredentialsValid()) {
			return "failure";
		}
		
		return "dashboard";
	}
	
	private boolean isCredentialsValid() {
//		emp.setEmplid(550550);
		return PersonDao.isCredentialExists(emp);
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
