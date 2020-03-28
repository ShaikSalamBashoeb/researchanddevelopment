package com.adp;

import java.rmi.RemoteException;

public class ClientTest {

	public static void main(String[] args) throws RemoteException {
		
		//below code would be used when client stub got generated through wsimport command
		/*EmployeeServiceService es = new EmployeeServiceService();
		EmployeeService employeeService = es.getEmployeeServicePort();
		System.out.println(employeeService.getEmployeeName(1001));*/
		
		//below code would be used when client stub got generated through eclipse web service client wizard
		EmployeeServiceProxy es = new EmployeeServiceProxy("http://localhost:9927/EmployeeTestService");
		System.out.println(es.getEmployeeName(100));
	}
}
