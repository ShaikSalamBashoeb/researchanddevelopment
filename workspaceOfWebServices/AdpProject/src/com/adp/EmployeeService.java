package com.adp;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class EmployeeService {
	
	@WebMethod
	public String getEmployeeName(int id) {
		String name = null; 
		if(id == 100) {
			name = "Salam";
		} else {
			name = "Not Found";
		}
		
		return name;
	}

}
